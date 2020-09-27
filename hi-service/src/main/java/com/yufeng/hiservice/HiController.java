package com.yufeng.hiservice;

import com.yufeng.common.result.ResultEntity;
import com.yufeng.common.result.ResultEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009262220
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private int port;


    @RequestMapping("/hi")
    public String hi(){
        ResultEntity result = new ResultEntity(ResultEnum.SUCCESS);
        result.setData("hi,I am from port"+port);
        return result.toString();
    }


}
