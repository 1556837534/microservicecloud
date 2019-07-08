package com.yun.springcloud.service.fallback;

import com.yun.springcloud.modules.Dept;
import com.yun.springcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.springcloud.service.fallback
 * @Author: Jackson_J
 * @CreateTime: 2019-07-08 20:24
 * @Description: Hystrix 熔断 fallback 处理类
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id)
            {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
