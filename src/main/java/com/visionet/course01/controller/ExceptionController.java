package com.visionet.course01.controller;

import com.visionet.course01.model.User;
import com.visionet.course01.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,@RequestParam("pass") String pass) {
        logger.info("name,{}",name);
        logger.info("pass,{}",pass);
        return new JsonResult();
    }

    @GetMapping("/nullpointtest")
    public JsonResult testNullPoint() {
        User user = null;
        user.getId();
        return new JsonResult();
    }


}
