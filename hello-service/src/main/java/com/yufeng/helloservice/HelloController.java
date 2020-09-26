package com.yufeng.helloservice;

import com.yufeng.common.result.ResultEntity;
import com.yufeng.common.result.ResultEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009262220
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;


    @RequestMapping("/hello")
    public String hello(){
        ResultEntity result = new ResultEntity(ResultEnum.SUCCESS);
        result.setData("hello,I am from port"+port);
        return result.toString();
    }


}
