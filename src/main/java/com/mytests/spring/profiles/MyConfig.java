package com.mytests.spring.profiles;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;


/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: spring-profiles-java-bean-methods-only</p>
 * *
 */
@Configuration
public class MyConfig {

    @Bean
    public Bar bar(Foo foo, Boo boo, DataSource ds, String s) {
        return new Bar(foo, s);
    }
    //// public project class type beans ////
    @Bean  @Profile("p1")
    public Foo foo1() {
        
        return new Foo("p1foo");
    }
    @Bean  @Profile("p2")
    public Foo foo2() {
        
        return new Foo("p2foo");
    }
    
    //// non-public project class type beans ////
    @Bean @Profile("p3")
    Boo fooBean() {
        return new Boo("p1");
    }
    @Bean @Profile("p4")
    Boo defaultBean() {
        return new Boo("p2");
    }
    
    //// public non-project class type beans ////
    @Bean @Profile("p5")
    public DataSource ds1(){
        return new MysqlDataSource();
     }
    @Bean @Profile("p6")
    public DataSource ds2(){
        return new MysqlDataSource();
    }
    
    //// non-public non-project class type beans ////
    @Bean @Profile("p7")
    String foo_string() {

        return "p1str";
    }
    @Bean @Profile("p8")
    String default_string() {

        return "p2str";
    }
}
