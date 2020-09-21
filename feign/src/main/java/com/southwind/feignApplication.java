package com.southwind;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class feignApplication {
    public static void main(String[] args) {
        SpringApplication.run(feignApplication.class,args);
    }
}
