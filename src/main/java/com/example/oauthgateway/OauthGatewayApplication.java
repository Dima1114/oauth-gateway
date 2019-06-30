package com.example.oauthgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class OauthGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthGatewayApplication.class);
    }
}
