package com.yufeng.ribbon.controller;

import com.yufeng.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202009270248
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Resource
    private RibbonService ribbonService;

    @RequestMapping(value = "/ribbon_hello")
    public String hi() {
        return ribbonService.hiService();
    }

}
