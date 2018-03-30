package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 高可用的分布式配置中心  服务端
 * @author pain
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigServerApplication.class, args);
	}
}
