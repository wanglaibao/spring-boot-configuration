package com.laibao.springboot.springbootconfiguration.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author laibao wang
 * @date 2018-01-16
 * @version 1.0
 */

@ConfigurationProperties(prefix = "person", ignoreInvalidFields = true)
public class PersonOne {
    private Name userName;

    public PersonOne() {
    }

    public Name getUserName() {
        return userName;
    }

    public void setUserName(Name userName) {
        this.userName = userName;
    }
}
