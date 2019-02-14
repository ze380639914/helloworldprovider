package com.service.helloworldprovider;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class HelloworldproviderApplication {
    public static void main(String[] args) {
         SpringApplication.run(HelloworldproviderApplication.class,args);
    }
}
