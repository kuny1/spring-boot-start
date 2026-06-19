package com.wk.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 是一个复合注解，包含了：
 * - @Configuration
 * - @EnableAutoConfiguration（开启自动配置）
 * - @ComponentScan（自动扫描当前包及子包的组件）
 *
 * 整个Spring Boot应用由此类驱动。
 */
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		// 启动内嵌 Tomcat，初始化 Spring 容器
		SpringApplication.run(StartApplication.class, args);
		System.out.println("🚀 应用已启动，访问 http://localhost:8080/hello");
	}

}
