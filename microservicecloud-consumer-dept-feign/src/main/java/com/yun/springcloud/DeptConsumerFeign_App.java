package com.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yun.springcloud"})
@ComponentScan("com.yun.springcloud")
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
public class DeptConsumerFeign_App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerFeign_App.class, args);
	}
}
