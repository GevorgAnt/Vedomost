package com.example.vedomost.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll() // Allow access to static resources
                        .requestMatchers("/login").permitAll() // Allow access to login page
                        .anyRequest().authenticated() // Require authentication for other requests
                )
                .formLogin()
                .loginPage("/login") // Specify login page URL
        // ... other form login configurations (usernameParameter, passwordParameter, etc.)
        // ... other security configurations as needed
        ;
        return http.build();
    }


}