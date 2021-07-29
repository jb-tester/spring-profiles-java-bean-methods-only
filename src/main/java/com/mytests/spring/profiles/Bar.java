package com.mytests.spring.profiles;

/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: spring-profiles-java-bean-methods-only</p>
 * *
 */
public class Bar {

    public Bar(Foo foo, String str) {
        this.foo = foo;
        this.str = str;
    }

    
    private final Foo foo;

    

    private final String str;

    

    public void display(){
        System.out.println("**********************************");
        System.out.println(foo.getId() + " " + str);
        System.out.println("**********************************"); 
    }
}
