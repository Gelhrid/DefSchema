package com.kod;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.kod"}) //o tym poczytac tutajhttps://spring.io/guides/gs/rest-service/ http://websystique.com/spring-boot/spring-boot-introduction-hello-world-example/
public class MainConfiguration
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainConfiguration.class, args);
    }
}
