package org.example.order.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.example.order.config.ServiceProperties;
import org.example.order.dto.Order;
import org.example.order.dto.User;
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
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private ServiceProperties serviceProperties;

    @Override
    public Order queryOrder(JSONObject jsonObject) {
        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        order.setUser(restTemplate.postForObject(serviceProperties.getUserQuery(), jsonObject, User.class));
        return order;
    }
}
