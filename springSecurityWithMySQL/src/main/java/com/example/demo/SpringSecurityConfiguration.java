package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration{
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				authorize->authorize
							.requestMatchers("/admin").hasRole("ADMIN")
							.requestMatchers("/user","/manager").hasAnyRole("USER", "MANAGER", "ADMIN")
							.requestMatchers("/", "/login", "/logout", "/newUser").permitAll()
							)
							.formLogin(formLogin->formLogin.permitAll());
		return http.build();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//		manager.createUser(User.withDefaultPasswordEncoder().username("user").password("$2a$10$qE8Uahf3igXX3gxvXlN19euQp8WHX3Z0RdHEHeDrTglsT5lwZYmD2").roles("USER").build());
//		manager.createUser(User.withDefaultPasswordEncoder().username("manager").password("$2a$10$qE8Uahf3igXX3gxvXlN19euQp8WHX3Z0RdHEHeDrTglsT5lwZYmD2").roles("MANAGER").build());
//		manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("$2a$10$qE8Uahf3igXX3gxvXlN19euQp8WHX3Z0RdHEHeDrTglsT5lwZYmD2").roles("ADMIN").build());
//		return manager;
//	}
	
	@Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	
}
