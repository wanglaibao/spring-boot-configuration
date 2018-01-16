package com.laibao.springboot.springbootconfiguration.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author laibao wang
 * @date 2018-01-16
 * @version 1.0
 */
@Component
public class Person {

    @Value("${person.name}")
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
