package com.sample.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Subject {

    @Autowired
    @Qualifier("teacher1")
    public Teacher teacher;

    Subject(){
        System.out.println("an instance of subject is creating");
    }

    public void say(){

        teacher.hello();
    }
}
