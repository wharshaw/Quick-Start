package com.sample.quickstart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Teacher teacher(){
        Teacher teacher = new Teacher();
        teacher.setName(" Bandara");
        return teacher;
    }
}
