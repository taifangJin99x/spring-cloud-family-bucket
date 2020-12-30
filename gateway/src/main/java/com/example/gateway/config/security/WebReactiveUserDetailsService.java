package com.example.gateway.config.security;

import com.example.gateway.domian.User;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @className: com.example.gateway.config.security-> WebReactiveUserDetailsService
 * @description:
 * @author: tfJin
 * @createDate: 2020-12-22 20:58
 * @version: 1.0
 * @todo:
 */

public class WebReactiveUserDetailsService{
//    @Override
//    public Mono<UserDetails> findByUsername(String s) {
//        User user = new User("admin","admin");
//        new org.springframework.security.core.userdetails.User(user.getUsername(),
//                user.getPassword(),
//                user.isEnabled(),
//                user.isAccountNonExpired(),
//                user.isCredentialsNonExpired(),
//                user.isAccountNonLocked(),
//                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        return Mono.just(user);
//    }
}
