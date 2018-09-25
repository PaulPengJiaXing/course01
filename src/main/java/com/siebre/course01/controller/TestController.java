package com.siebre.course01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/log")
    public String testLog() {
        logger.debug("===========测试日志debug级别打印============");
        logger.info("===========测试日志info级别打印============");
        logger.error("===========测试日志error级别打印============");
        logger.warn("===========测试日志warn级别打印============");

        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.com";
        logger.info("=========paul's 个人博客:{};paul's csdn 博客：{}",str1,str2);
        return "success";
    }
}
