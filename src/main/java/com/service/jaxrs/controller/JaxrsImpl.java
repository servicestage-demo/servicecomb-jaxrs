package com.service.jaxrs.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2020-04-13T10:46:13.216Z")


@RestSchema(schemaId = "jaxrs")
@Path("/jaxrs")

@Produces({ "application/json" })
public class JaxrsImpl  {

    @Autowired
    private JaxrsDelegate jaxrsDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return jaxrsDelegate.helloworld(name);
    }
}

