package com.king.wisheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gaoxiaojin
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class WishEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WishEurekaApplication.class, args);
    }

}
