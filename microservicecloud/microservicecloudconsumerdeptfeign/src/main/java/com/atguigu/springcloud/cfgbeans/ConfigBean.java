package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author run.jin
 * @version 1.0
 * @name ConfigBean
 * @description
 * @date 2019/10/8
 */
@Configuration
public class ConfigBean {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule()
//    {
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
//    }


}
