package com.ahhf.cly.Fda;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@SpringBootApplication
@Slf4j
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("test123")
    public Object fa() {
        log.info("当前的时间啊11111111111：" + new Date().toLocaleString());
        return "当前的时间啊11111111111：" + new Date().toLocaleString();
    }
}
