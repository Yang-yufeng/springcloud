package com.yufeng.helloservice;

import com.yufeng.common.result.ResultEntity;
import com.yufeng.common.result.ResultEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yangwu
 * @since 2021/5/7 11:37
 */
@RestController
@RefreshScope
public class HelloController {


    @Value("${name}")
    private String name;


    @RequestMapping("/hello")
    public String hello(){
        ResultEntity result = new ResultEntity(ResultEnum.SUCCESS);
        result.setData(name+",hello,my name is "+name);
        return result.toString();
    }


}
