package com.yun.springcloud.dao;

import com.yun.springcloud.modules.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.springcloud.dao
 * @Author: Jackson_J
 * @CreateTime: 2019-07-07 11:59
 * @Description: ${Description}
 */
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
