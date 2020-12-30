package com.example.account.api;

import com.alibaba.fastjson.JSONObject;
import com.example.account.client.GatewayService;
import com.example.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    GatewayService gatewayService;
    @Autowired

    UserService userService;
    @GetMapping("/getUser")
    public String getUser() {

        return userService.getUser();
    }
    @GetMapping("/client")
    public String client() {
         Object test = gatewayService.test();
        return "user";
    }
    @GetMapping("/login")
    public String getUser(@RequestParam("username")String username,
                          @RequestParam("password") String password) {

        return userService.login(username,password);
    }

}
