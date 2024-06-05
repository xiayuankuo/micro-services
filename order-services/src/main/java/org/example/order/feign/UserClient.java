package org.example.order.feign;

import com.alibaba.fastjson.JSONObject;
import org.example.order.dto.User;
import org.example.order.feign.config.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author yuankuo.xia
 * @Date 2024/6/5
 */
@FeignClient(value = "user-service", configuration = FeignClientConfiguration.class)
public interface UserClient {
    @PostMapping("user/queryUser")
    User queryUser(JSONObject jsonObject);

    @PostMapping("user/userToString")
    String userToString(User user);
}
