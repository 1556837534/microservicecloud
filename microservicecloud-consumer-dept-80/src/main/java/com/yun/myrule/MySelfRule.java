package com.yun.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.myrule
 * @Author: Jackson_J
 * @CreateTime: 2019-07-07 20:05
 * @Description: Ribbon 自定义规则类 不能与主启动类在同一包目录下
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule () {
        return new MyRandomRule();
    }

}
