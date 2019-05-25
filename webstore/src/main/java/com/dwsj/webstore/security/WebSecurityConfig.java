package com.dwsj.webstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception{
        authenticationMgr.inMemoryAuthentication()
                .withUser("devuser").password("{noop}dev").authorities("ROLE_USER")
                .and()
                .withUser("adminuser").password("{noop}admin").authorities("ROLE_USER","ROLE_ADMIN");
    }

    //Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/products/").hasRole("USER")
                .antMatchers("/clients/").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

}
