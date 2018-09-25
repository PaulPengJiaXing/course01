package com.siebre.course01.controller;

import com.siebre.course01.model.Blogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/test404")
    public String test404() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1/0;
        return "index";
    }

    @GetMapping("/getBlogger")
    public String getBlogger(Model model) {
        Blogger blogger = new Blogger(1,"paul","aaa");
        model.addAttribute("blogger",blogger);
        return "blogger";
    }

    @GetMapping("/getList")
    public String getList(Model model) {
        Blogger b1 = new Blogger(1,"paul","aaa");
        Blogger b2 = new Blogger(2,"amy","bbb");
        List<Blogger> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        model.addAttribute("list",list);
        return "list";
    }
}
