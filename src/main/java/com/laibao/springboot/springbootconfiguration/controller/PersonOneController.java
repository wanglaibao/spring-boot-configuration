package com.laibao.springboot.springbootconfiguration.controller;

import com.laibao.springboot.springbootconfiguration.beans.Person;
import com.laibao.springboot.springbootconfiguration.beans.PersonOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A on 2018/1/16.
 */
@RestController
@RequestMapping("/users")
@EnableConfigurationProperties(PersonOne.class)
public class PersonOneController {

    @Autowired
    private PersonOne person;

    @GetMapping
    public PersonOne getPersonOne() {
        return person;
    }

    @RequestMapping("/id/10")
    public PersonOne getPersonOneById() {
        return person;
    }
}
