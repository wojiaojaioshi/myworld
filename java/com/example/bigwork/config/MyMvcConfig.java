package com.example.bigwork.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/").setViewName("/login");
/*        registry.addViewController("/index.html").setViewName("index");//增加一个maxi.html的连接，实际跳转index*/

    }
    @Override

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");


    }


    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/login.html","/toregister","/register","/","/tologin","/login","/static/**");
    }


}
