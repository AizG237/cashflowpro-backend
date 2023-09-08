package com.cashflowpro.cashflowpro.config;

import jakarta.servlet.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private final cfpAuthentificationFilter jwtAuthFilter;
    private final AuthenticationProvider authentificationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("/auth/**")
                .permitAll()
                 .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authentificationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
 /*http.csrf(Customizer.withDefaults()).authenticationProvider(authentificationProvider)
         .authorizeHttpRequests(Customizer.withDefaults())

         // .requestMatchers(" ")
         //  .permitAll()
         //  .anyRequest()
         // .authenticated()
         // .and()
         .sessionManagement(Customizer.withDefaults())
         //.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
         //.and()
         .authenticationProvider(authentificationProvider)
         .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
*/