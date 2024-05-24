package org.example.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuankuo.xia
 * @Date 2024/5/24
 */
@Configuration
@ConfigurationProperties(prefix = "service.name")
@Data
public class ServiceProperties {
    public String order;

}
