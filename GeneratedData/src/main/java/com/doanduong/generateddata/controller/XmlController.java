package com.doanduong.generateddata.controller;

import com.doanduong.generateddata.entities.ListUserXml;
import com.doanduong.generateddata.entities.UserXml;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class XmlController {
    @RequestMapping("/")
    private String index() {
        return "index";
    }

    @RequestMapping("/xml")
    @ResponseBody
    public UserXml testXml() {
        UserXml user = new UserXml(1, "duong", "duong1999ngt@gmail.com");
        return user;
    }

    @RequestMapping("/list-xml")
    @ResponseBody
    public ListUserXml testListXml() {
        UserXml userXml1 = new UserXml(1, "duong", "duong1999ngt@gmail.com");
        UserXml userXml2 = new UserXml(1,"trang","ng.mtrang@gmail.com");
        List<UserXml> userXmlList = new ArrayList<>();
        userXmlList.add(userXml1);
        userXmlList.add(userXml2);
        ListUserXml listUserXml = new ListUserXml(userXmlList);
        return listUserXml;
    }
}
