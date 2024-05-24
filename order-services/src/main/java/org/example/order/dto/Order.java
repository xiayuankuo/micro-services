package org.example.order.dto;

import lombok.Data;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Data
public class Order {
    private String orderId;
    private User user;
}
