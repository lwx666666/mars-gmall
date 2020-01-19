package com.mars.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * logstash整合：
 *  1.导入logstash-logback-encoder jar包
 *  2.导入日志配置
 *  3.在kibana中使用logstash创建日志索引，就可以可视化检索
 */
@EnableDubbo
@MapperScan(basePackages = "com.mars.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallPmsApplication.class, args);
	}

}
