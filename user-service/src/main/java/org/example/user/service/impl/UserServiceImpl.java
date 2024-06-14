package org.example.user.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSONObject;
import org.example.user.dto.User;
import org.example.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User queryUser(JSONObject jsonObject) {
        User user = new User();
        user.setUserId(jsonObject.getString("userId"));
        user.setUserName(String.valueOf(new Random().nextInt(10)));
        return user;
    }

    @Override
    @SentinelResource
    public String trace(String trace) {
        return trace;
    }
}
