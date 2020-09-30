package com.yufeng.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009301413
 */

@FeignClient("hello-service")
public interface FeignService {

    @RequestMapping("/hello")
    String hello();
}
