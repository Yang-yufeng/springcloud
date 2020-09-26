package com.yufeng.ribbon.service.impl;

import com.yufeng.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009270249
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Resource
    private RestTemplate restTemplate;


    public String hiService() {
        String result = restTemplate.getForObject("http://hello-service/hello", String.class);
        System.out.println(result);
        return result;
    }
}
