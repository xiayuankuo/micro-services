package org.example.order.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuankuo.xia
 * @Date 2024/6/5
 */
public class FeignClientConfiguration {
    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }
}
