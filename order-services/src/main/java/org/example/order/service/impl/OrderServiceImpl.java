package org.example.order.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.example.order.config.ServiceProperties;
import org.example.order.dto.Order;
import org.example.order.dto.User;
import org.example.order.feign.UserClient;
import org.example.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Service
public class OrderServiceImpl implements OrderService {
//    @Resource
//    private RestTemplate restTemplate;   //ribbon集成 bean加 @LoadBalance
    @Resource
    private ServiceProperties serviceProperties;

    @Resource
    UserClient userClient;

    @Override
    public Order queryOrder(JSONObject jsonObject) {
        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
//        order.setUser(restTemplate.postForObject(serviceProperties.getUser(), jsonObject, User.class));
        order.setUser(userClient.queryUser(jsonObject));
        return order;
    }

    @Override
    public String testAnnotation() {
        return userClient.userToString(new User());
    }
}
