package com.example.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.example.gateway.client.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @className: com.example.gateway.filter-> TokenFilter
 * @description: 拦截token
 * @author: tfJin
 * @createDate: 2020-12-10 10:28
 * @version: 1.0
 * @todo:
 */
@Component
public class TokenFilter implements GlobalFilter, Ordered {
    @Autowired
    AccountService accountService;
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /*
        这个request对象可以获取更多的内容
       比如，如果是使用token验证的话，就可以判断它的Header中的Token值了
       为了演示方便，我就判断了它的参数
         */
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

//        Boolean check = accountService.checkToken(request.getHeaders().getFirst("cookie"));
//        if (check || request.getURI().getPath().equals("/api/user/user/login")){
            //放行
            return chain.filter(exchange);
//        }
//        response.setStatusCode(HttpStatus.UNAUTHORIZED);
//        byte[] bytes = "{\"status\":\"-1\",\"msg\":\"error\"}".getBytes(StandardCharsets.UTF_8);
//        DataBuffer buffer = exchange.getResponse().bufferFactory().wrap(bytes);
//        return exchange.getResponse().writeWith(Flux.just(buffer));
    }

    @Override
    public int getOrder() {
        return 0;
    }
    private Mono<Void> getVoidMono(ServerHttpResponse serverHttpResponse) {
        serverHttpResponse.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
        DataBuffer dataBuffer = serverHttpResponse.bufferFactory().wrap("403没权限".getBytes());
        return serverHttpResponse.writeWith(Flux.just(dataBuffer));
    }
}
