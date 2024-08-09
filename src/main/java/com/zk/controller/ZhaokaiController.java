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
        String a = "为萨夫是德国";
        System.out.println(a);
        return a;
    }

}
