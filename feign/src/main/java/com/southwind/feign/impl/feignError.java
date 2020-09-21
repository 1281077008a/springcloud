package com.southwind.feign.impl;
import com.southwind.entity.student;
import com.southwind.feign.feignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class feignError  implements feignProviderClient{
    @Override
    public Collection<student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
