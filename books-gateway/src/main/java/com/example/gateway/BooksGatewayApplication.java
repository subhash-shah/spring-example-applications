package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.gateway.filters.SampleZuulFilter;

@EnableZuulProxy
@SpringBootApplication
public class BooksGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksGatewayApplication.class, args);
	}
	
	@Bean
	public SampleZuulFilter sampleZuulFilter() {
		return new SampleZuulFilter();
	}
}
