package com.southwind.controller;

import com.southwind.entity.student;
import com.southwind.feign.feignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class hystrixHandler {
    @Autowired
    private feignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}