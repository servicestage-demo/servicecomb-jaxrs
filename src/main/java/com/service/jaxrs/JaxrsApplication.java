package com.service.jaxrs;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class JaxrsApplication {
    public static void main(String[] args){
        SpringApplication.run(JaxrsApplication.class,args);
    }
}
