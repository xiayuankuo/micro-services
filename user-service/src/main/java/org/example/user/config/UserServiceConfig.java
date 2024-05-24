package org.example.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Configuration
public class UserServiceConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
