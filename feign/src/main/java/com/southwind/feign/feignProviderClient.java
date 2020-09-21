package com.southwind.feign;

import com.southwind.entity.student;
import com.southwind.feign.impl.feignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = feignError.class)
public interface feignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<student> findAll();

    @GetMapping("/student/index")
    public String index();
}
