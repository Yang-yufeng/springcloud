package com.yufeng.feign.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.yufeng.feign.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009301412
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Resource
    private FeignService feignService;

    @RequestMapping(value = "/feign_hello")
    public String hello() {
        System.out.println("访问到接口");
        return feignService.hello();
    }


}
