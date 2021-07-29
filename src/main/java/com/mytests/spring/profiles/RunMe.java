package com.mytests.spring.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: spring-profiles-java-bean-methods-only</p>
 * *
 */
public class RunMe {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext =  new AnnotationConfigApplicationContext();
        appContext.getEnvironment().setActiveProfiles( "p1" );
        appContext.register( MyConfig.class );
        appContext.refresh();
        Bar bar  = appContext.getBean(Bar.class);
    }

}