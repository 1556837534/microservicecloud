package com.yun.springcloud.controller;

import java.util.List;

import com.yun.springcloud.modules.Dept;
import com.yun.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @Author Jackson_J
 * @Description 消费者Controller
 * @Date 15:52 2019/7/7
 * @Param
 * @return
 **/
@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return this.deptClientService.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return this.deptClientService.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept)
	{
		return this.deptClientService.add(dept);
	}
}
