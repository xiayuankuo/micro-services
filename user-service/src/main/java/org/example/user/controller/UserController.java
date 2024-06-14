package org.example.user.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.user.dto.User;
import org.example.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/user/queryUser")
    public User queryUser(@RequestBody JSONObject jsonObject){
        return userService.queryUser(jsonObject);
    }

    @GetMapping("/user/getMatrix/{user}/{order}")
    public String getMatrix(@MatrixVariable(value = "id", pathVar = "user") String userId,
                            @MatrixVariable(value = "id", pathVar = "order") String orderId){
        return userId + " **** " + orderId;
    }

    @PostMapping("/user/userToString")
    public String userToString(User user){
        return user.toString();
    }

    @GetMapping("/user/traceA")
    public String sentinelTraceA(){
        return userService.trace("a");
    }

    @GetMapping("/user/traceB")
    public String sentinelTraceB(){
        return userService.trace("b");
    }
}
