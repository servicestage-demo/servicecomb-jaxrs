package com.service.jaxrs.controller;

import org.springframework.stereotype.Component;


@Component
public class JaxrsDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
