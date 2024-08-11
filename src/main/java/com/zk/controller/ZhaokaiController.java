package com.zk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zk
 * @create 2024-08-09 18:13
 */

@Slf4j
@Controller
@RequestMapping("/zk")
public class ZhaokaiController {


    @GetMapping("/test")
    @ResponseBody
    public String exportToWeb() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("这是一个springboot+maven的测试项目, ");
        System.out.println(stringBuffer.toString());
        stringBuffer.append("成功使用jenkins流水线构建打包部署在docker中了！");
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

}
