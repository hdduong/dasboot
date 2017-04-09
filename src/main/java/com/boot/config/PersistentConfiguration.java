package com.boot.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;

import javax.activation.DataSource;

/**
 * Created by HienD on 4/8/2017.
 */
//@Configuration
public class PersistentConfiguration {

    //@Bean
    //@ConfigurationProperties(prefix = "spring.datasource")
    //@Primary
    public DataSource dataSource() {
        return (DataSource) DataSourceBuilder.create().build();
    }
}
