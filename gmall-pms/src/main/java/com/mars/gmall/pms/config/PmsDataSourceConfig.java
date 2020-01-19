package com.mars.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ShardingJDBC数据源配置类
 */
@Configuration
public class PmsDataSourceConfig {

//    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        File shardingJdbcFile = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(shardingJdbcFile);
        return dataSource;
    }
}
