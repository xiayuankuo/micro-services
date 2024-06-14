package org.example.user.service;

import com.alibaba.fastjson.JSONObject;
import org.example.user.dto.User;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
public interface UserService {

    User queryUser(JSONObject jsonObject);

    String trace(String trace);
}
