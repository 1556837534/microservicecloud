package com.yun.springcloud.modules;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @BelongsProject: microservicecloud
 * @BelongsPackage: com.yun.springcloud.modules
 * @Author: Jackson_J
 * @CreateTime: 2019-07-07 11:02
 * @Description: 部门类
 *
 * lombok（小辣椒） 用来解决实体类中的 构造器 与set、get 方法  需要编译工具安装 lombok插件 才支持识别
 * @AllArgsConstructor 全参构造函数
 * @NoArgsConstructor 无参构造器
 * @Data 每个属性生成get.set方法
 * @Accessors 链式访问规则  指定生成属性ger。set 方法名  chain = true ==》 getXX  setXX   fluent=true ===> xxx   xxxx
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = 713386869713515558L;

    /**
     * @Author Jackson_J
     * @Description
     * @Date 11:08 2019/7/7
     * @Param  主键ID
     * @return
     **/
    private Long deptno;
    /**
     * @Author Jackson_J
     * @Description
     * @Date 11:08 2019/7/7
     * @Param 部门名称
     * @return
     **/
    private String dname;

    /**
     * @Author Jackson_J
     * @Description
     * @Date 11:08 2019/7/7
     * @Param 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     * @return
     **/
    private String 	dbSource;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
