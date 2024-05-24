package org.example.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Configuration
@ConfigurationProperties(prefix = "service.name")
public class ServiceProperties {
    public String order;

}
