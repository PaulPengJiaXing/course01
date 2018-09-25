package com.siebre.course01.controller;

import com.siebre.course01.model.User;
import com.siebre.course01.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {

    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User(1l,null,"123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1l,"paul","123456");
        User user2 = new User(2l,"mike","123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList,"获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String,Object> map = new HashMap<>();
        User user = new User(1l,"paul","1234");
        map.put("作者信息",user);
        map.put("作者地址","上海市宝山区");
        map.put("粉丝数量",100);
        return new JsonResult<>(map);
    }
}
