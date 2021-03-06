package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author run.jin
 * @version 1.0
 * @name MySelfRule
 * @description
 * @date 2019/10/11
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
       // return new RandomRule();//Ribbon默认是轮询，我自定义为随机
        return new StrengthenRandomRule();
    }

}
