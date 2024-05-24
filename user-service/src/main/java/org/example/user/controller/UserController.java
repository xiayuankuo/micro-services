package org.example.user.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.user.dto.User;
import org.example.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("queryUser")
    public User queryUser(@RequestBody JSONObject jsonObject){
        return userService.queryUser(jsonObject);
    }
}
