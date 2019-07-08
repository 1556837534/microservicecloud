package com.yun.springcloud.service;

import com.yun.springcloud.modules.Dept;
import com.yun.springcloud.service.fallback.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.springcloud.service
 * @Author: Jackson_J
 * @CreateTime: 2019-07-08 20:21
 * @Description: Feign 接口
 * 新建
 *
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
