package com.cssl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by tym on 2019/2/5 0005.
 */
@SpringBootApplication
@EnableEurekaServer    // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer6002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer6002_App.class, args);
    }
}
