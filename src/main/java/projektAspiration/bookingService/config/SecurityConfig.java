////package de.aittr.g_27_bookingService.config;
////
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////
////@Configuration
////public class SecurityConfig {
////
////  @Bean
////  public BCryptPasswordEncoder bCryptPasswordEncoder() {
////    return new BCryptPasswordEncoder();
////  }
////}
//
////упрощенный вариант типа
//package projektAspiration.bookingService.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//  @Bean
//  public BCryptPasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//        .authorizeRequests()
//        .antMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
//        .anyRequest().authenticated() // Для остальных URL требовать аутентификацию
//        .and()
//        .formLogin()
//        .and()
//        .httpBasic();
//  }
//}