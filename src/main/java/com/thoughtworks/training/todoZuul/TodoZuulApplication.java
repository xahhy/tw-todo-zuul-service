package com.thoughtworks.training.todoZuul;

import com.thoughtworks.training.todoZuul.filters.pre.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class TodoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoZuulApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}
