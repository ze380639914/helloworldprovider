package com.service.helloworldprovider.controller;


import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-04-08T08:22:37.433Z")

@RestSchema(schemaId = "helloworldprovider")
@RequestMapping(path = "/helloworldprovider", produces = MediaType.APPLICATION_JSON)
public class HelloworldproviderImpl {

    @Autowired
    private HelloworldproviderDelegate userHelloworldproviderDelegate;

    private RestTemplate restTemple = RestTemplateBuilder.create();

    @RequestMapping(value = "/helloworld",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public String helloworld(@RequestParam(value = "name", required = true) String name) {
        System.out.println("----------xianshun--------");
        return userHelloworldproviderDelegate.helloworld(name);
    }

    @RequestMapping(value = "/callwast",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public String callwast(@RequestParam(value = "name", required = true) String name) {
        System.out.println("----------xianshun--------");
        return restTemple.getForObject("cse://warst/warst/rest/xs/avai?name=" + name, String.class);
    }
}
