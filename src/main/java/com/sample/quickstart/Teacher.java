package com.sample.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("teacher1")
public class Teacher {

    private String name = " World";

    Teacher(){
        System.out.println("an instance of teacher is creating");
    }

    public void hello(){


        System.out.println("Hello" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
