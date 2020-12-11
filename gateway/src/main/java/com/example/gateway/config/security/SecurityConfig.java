package com.example.gateway.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * 微信公众号 “小鱼与Java”
 *
 * @date 2020/4/14
 * @auther Lyn4ever
 */
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    /**
     * 用户的接口类
     * @return
     */
    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        return new MapReactiveUserDetailsService(user);
    }

    /**
     * 主要过滤配置类
     * @param http
     * @return
     */
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange()
                    //mapi需要验证，其他放过
                .pathMatchers("/mapi/**").hasRole("ADMIN")
                .anyExchange().permitAll()
                .and()
                .httpBasic().and()
                .formLogin();
        return http.build();
    }
}
