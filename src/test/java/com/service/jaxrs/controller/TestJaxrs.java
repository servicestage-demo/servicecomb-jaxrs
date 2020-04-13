package com.service.jaxrs.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJaxrs {

      JaxrsDelegate jaxrsDelegate = new JaxrsDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = jaxrsDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
