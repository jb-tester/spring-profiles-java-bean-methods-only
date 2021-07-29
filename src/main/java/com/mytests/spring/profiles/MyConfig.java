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
    public Bar bar(Foo foo, String s, DataSource ds) {
        
        return new Bar(foo, s);
    }
    
    @Bean  @Profile("p1")
    public Foo foo1() {
        
        return new Foo("p1foo");
    }
    @Bean  @Profile("p2")
    public Foo foo2() {
        
        return new Foo("p2foo");
    }

    @Bean @Profile("p11")
    String foo_string() {
        
        return "p1str";
    }
    @Bean @Profile("p21")
    String default_string() {
        
        return "p2str";
    }
    
    @Bean @Profile("p111")
    DataSource ds1(){
        
        
        return new MysqlDataSource();
     }
    @Bean @Profile("p211")
    DataSource ds2(){
        
        
        return new MysqlDataSource();
    }
}
