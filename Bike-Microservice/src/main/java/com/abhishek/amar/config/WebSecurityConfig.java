/*
 * package com.abhishek.amar.config; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @Configuration public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity httpSecurity) throws
 * Exception {
 * httpSecurity.csrf().disable().authorizeRequests().antMatchers("/**").
 * permitAll().antMatchers(HttpMethod.OPTIONS, "/**"); } }
 */