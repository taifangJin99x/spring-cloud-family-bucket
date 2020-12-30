package com.example.gateway.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.gateway.controller-> TestController
 * @description: test
 * @author: tfJin
 * @createDate: 2020-12-08 17:45
 * @version: 1.0
 * @todo:
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "test")
    public String test(){
        return "test";
    }
}
