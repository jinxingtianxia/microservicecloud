package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author run.jin
 * @version 1.0
 * @name DeptProvider8001_App
 * @description
 * @date 2019/10/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003_App {


    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }
}
