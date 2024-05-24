package org.example.order.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.order.config.ServiceProperties;
import org.example.order.dto.Order;
import org.example.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@RequestMapping("/order")
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("queryOrder")
    public Order queryOrder(@RequestParam String userId){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", userId);
        return orderService.queryOrder(jsonObject);
    }
}
