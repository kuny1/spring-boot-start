package com.wk.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 相当于 @Controller + @ResponseBody
 * 表示该类中所有方法返回值直接写入 HTTP 响应体（如纯文本、JSON）
 */
@RestController
public class HelloController {

    /**
     * 映射路径 /hello
     * 直接返回字符串，不需要 JSP 或视图解析器
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot! (极简版)";
    }
}