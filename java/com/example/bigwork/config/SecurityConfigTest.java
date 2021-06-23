//package com.example.bigwork.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//@EnableWebSecurity
//public class SecurityConfigTest extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//    //注入数据源
////    @Autowired
////    private DataSource dataSource;
////    //配置对象
////    @Bean
////    public PersistentTokenRepository persistentTokenRepository() {
////        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
////        jdbcTokenRepository.setDataSource(dataSource);
////        //jdbcTokenRepository.setCreateTableOnStartup(true);
////        return jdbcTokenRepository;
////    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(password());
//                auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("1900300717").password(new BCryptPasswordEncoder().encode("wojiaojiaoshi")).roles("vip1");
//
//    }
//    @Bean
//    PasswordEncoder password() {
//        return new BCryptPasswordEncoder();
//    }
//
//   @Override
//    protected void configure(HttpSecurity http)throws Exception{
//        http.authorizeRequests().antMatchers("/").permitAll()//所有用户都能k'j'h
//                .antMatchers("/registerlist").permitAll()
//                                .antMatchers("/grant").hasRole("vip1");
//
//        http.formLogin()
//                .usernameParameter("loginid")
//                .passwordParameter("password")
//                .loginPage("/tologin")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/registerlist");
//
//
//    }
//
//    //    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
////                .withUser("1900300717").password(new BCryptPasswordEncoder().encode("wojiaojiaoshi")).roles("vip1");
////
////    }
//}