package com.mytests.spring.profiles;

/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: spring-profiles-java-bean-methods-only</p>
 * *
 */
public class Foo {
    
    String id;

    public String getId() {
        return id;
    }

    public Foo(String id) {
        this.id = id;
    }
}
