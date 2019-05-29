package com.da.demoprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);

        //自带了zk
//        new SpringApplicationBuilder(ProviderApplication.class)
//                .listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
////                    Environment environment = event.getEnvironment();
////                    int port = environment.getProperty("2181", int.class);
//                    new EmbeddedZooKeeper(2181, false).start();
//                }).run(args);
    }

}
