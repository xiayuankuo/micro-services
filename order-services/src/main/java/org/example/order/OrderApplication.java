package org.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuankuo.xia
 * @Date 2024/5/20
 */
@EnableFeignClients  //开启feign客户端
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {
    public static void main(String[] args){
        SpringApplication.run(OrderApplication.class, args);
    }
}
