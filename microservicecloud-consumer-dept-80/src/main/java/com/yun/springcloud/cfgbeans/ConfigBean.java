package com.yun.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.springcloud.cfgbeans
 * @Author: Jackson_J
 * @CreateTime: 2019-07-07 15:45
 * @Description: ${Description}
 */
@Configuration
public class ConfigBean {
    /**
     * @Author Jackson_J
     * @Description  @LoadBalanced  Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。  默认轮训
     *           提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful 服务模板类，是Spring 提供的用于访问Rest 服务的客户端工具集
     * @Date 15:47 2019/7/7
     * @Param []
     * @return org.springframework.web.client.RestTemplate
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    /**
     * @Author Jackson_J
     * @Description  负载均衡 规则
     * @Date 19:41 2019/7/7
     * @Param []
     * @return com.netflix.loadbalancer.IRule
     **/
    @Bean
    public IRule myRule () {
        return new RoundRobinRule(); //替换默认的轮训算法
    }


}
