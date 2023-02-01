package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("musicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Vivaldi Winter";
    }
    @PostConstruct
    public void init(){
        System.out.println("Initialization");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying");
    }
}
