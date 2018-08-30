package com.everis.alimentatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.everis.alimentatec.filter.MyCustomPreFilter;

@EnableZuulProxy
@SpringBootApplication
//NO ES NECESARIO @EnableDiscoveryClient
public class AlimentatecGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlimentatecGatewayApplication.class, args);
	}
	
	@Bean
	  public MyCustomPreFilter myCustomPreFilter() {
	    return new MyCustomPreFilter();
	  }

}
