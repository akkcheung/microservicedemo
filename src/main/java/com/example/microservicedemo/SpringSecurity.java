package com.example.microservicedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SpringSecurity implements WebMvcConfigurer {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 
		http.csrf().disable()
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/**", "/eureka/**").permitAll()
				.requestMatchers("/eureka-client-service/**", "/EUREKA-CLIENT-SERVICE/**" ).permitAll()
//				.requestMatchers("/index", "/register/**" ).permitAll()
				);

		return http.build();
	}
}
