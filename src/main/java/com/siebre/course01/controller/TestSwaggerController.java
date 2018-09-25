package com.siebre.course01.controller;

import com.siebre.course01.model.User;
import com.siebre.course01.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
@Api(value = "swagger2在线接口文档")
public class TestSwaggerController {
    private final static Logger logger = LoggerFactory.getLogger(TestSwaggerController.class);

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一ID获取用户信息")
    public JsonResult<User> getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") Long id) {
        User user = new User(id,"paul","123456");
        return new JsonResult<>(user);
    }

    @PostMapping("/insert")
    @ApiOperation("添加用户信息")
    public JsonResult insertUser(@RequestBody @ApiParam("用户信息") User user) {
        return new JsonResult();
    }
}
