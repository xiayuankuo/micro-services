package org.example.order.service;

import com.alibaba.fastjson.JSONObject;
import org.example.order.dto.Order;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
public interface OrderService {

    Order queryOrder(JSONObject jsonObject);

    String testAnnotation();
}
