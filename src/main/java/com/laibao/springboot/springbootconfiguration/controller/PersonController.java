package com.laibao.springboot.springbootconfiguration.controller;

import com.laibao.springboot.springbootconfiguration.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laibao wang
 * @date 2018-01-16
 * @version 1.0
 */
@RestController
public class PersonController {

    @Autowired
    private Person person;

    @GetMapping
    public Person getPerson() {
        return person;
    }
}
