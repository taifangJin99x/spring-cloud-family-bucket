package com.example.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.user.controller-> UserController
 * @description: 用户控制器
 * @author: tfJin
 * @createDate: 2020-12-09 10:06
 * @version: 1.0
 * @todo:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUser")
    public String getUser() {
        return "user";
    }
}
