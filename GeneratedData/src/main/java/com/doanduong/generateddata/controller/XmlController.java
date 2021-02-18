package com.doanduong.generateddata.controller;

import com.doanduong.generateddata.entities.ListUserXml;
import com.doanduong.generateddata.entities.UserJson;
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

    // Trả dữ liệu về XML
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

    // Trả dữ liệu về Json
    @RequestMapping("/json")
    @ResponseBody
    public UserJson testJSON() {
        UserJson userJson = new UserJson(1, "kai", "abc@gmail.com");
        return userJson;
    }
    @RequestMapping("/list-json")
    @ResponseBody
    public List<UserJson> testListJSON() {
        List<UserJson> listUser = new ArrayList<UserJson>();
        listUser.add(new UserJson(1, "kai", "abc@gmail.com"));
        listUser.add(new UserJson(2, "stack", "def@yahoo.com"));
        return listUser;
    }
}
