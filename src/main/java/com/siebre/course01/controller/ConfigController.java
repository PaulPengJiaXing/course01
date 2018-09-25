package com.siebre.course01.controller;

import com.siebre.course01.utils.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConfigController {
    private final static Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Value("${url.orderUrl}")
    private String orderUrl;

    @Resource
    private MicroServiceUrl microServiceUrl;

    @RequestMapping("/testConfig")
    public String testConfig() {
        logger.info("=========获取订单服务地址为:{}",orderUrl);
        logger.info("=========获取订单服务地址为:{}",microServiceUrl.getOrderUrl());
        logger.info("=========获取用户服务地址为:{}",microServiceUrl.getUserUrl());
        logger.info("=========获取购物服务地址为:{}",microServiceUrl.getShoppingUrl());
        return "success";
    }

}
