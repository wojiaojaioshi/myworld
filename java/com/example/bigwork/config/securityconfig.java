//package com.example.bigwork.config;
//
//import com.example.bigwork.Service.login.loginService;
//import com.example.bigwork.entities.login;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@EnableWebSecurity
//public class securityconfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http)throws Exception{
//        http.authorizeRequests().antMatchers("/").permitAll()//所有用户都能k'j'h
//                                .antMatchers("/registerlist","/checklist","/outdruglist","/workerlist","/userlist").permitAll();
//
//        http.formLogin()
//                .usernameParameter("loginid")
//                .passwordParameter("password")
//                .loginPage("/tologin")
//                .loginProcessingUrl("/login").defaultSuccessUrl("/registerlist");
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("1900300717").password(new BCryptPasswordEncoder().encode("wojiaojiaoshi")).roles("vip1");
//
//    }
//}