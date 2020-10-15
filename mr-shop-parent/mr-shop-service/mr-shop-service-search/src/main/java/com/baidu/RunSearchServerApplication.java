package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName RunEsSearchApplication
 * @Description: TODO
 * @Author xiaopengyan
 * @Date 2020/9/16
 * @Version V1.0
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
@EnableEurekaClient
public class RunSearchServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunSearchServerApplication.class);
    }
}

