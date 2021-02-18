package com.doanduong.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String doGet() {
        return "test1";
    }
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String doPost() {
        return "test2";
    }
    @RequestMapping(value = "/method0", headers = "name=kai")
    public String method0() {
        return "page0";
    }
    @RequestMapping(value = "/method1", headers = { "name=kai", "id=1" })
    public String method1() {
        return "page1";
    }
    @RequestMapping(value = "/method2", produces = { "application/json"}, consumes = "text/html")
    public String method2() {
        return "page2";
    }

    // @PathVariable @RequestParam
    @RequestMapping("/test1/{id}")
    public String test1(@PathVariable("id") int id, Model model) {
        model.addAttribute("id", id);
        return "test1";
    }
    @RequestMapping("/test2/{id}/{name}")
    public String test2(@PathVariable("id") int id, @PathVariable("name")
                        String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test2";
    }
    @RequestMapping("/test3")
    public String test3(@RequestParam("name") String name, @RequestParam("id") int id,
                        Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test3";
    }

    // @ResponseBody : trả về text, json
    @RequestMapping("/response")
    @ResponseBody
    public String responseBody() {
        return "cold";
    }
}
