package com.doanduong.files.controller;

import com.doanduong.files.model.MyFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class BaseController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("myFile", new MyFile());
        return "index";
    }
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(MyFile myfile, Model model) {
        model.addAttribute("message","upload success");
        model.addAttribute("description", myfile.getDescription());


        try {
            MultipartFile multipartFile = myfile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            File file = new File("D:/", fileName);
            multipartFile.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "upload failed!");
        }
        return "result";
    }
}
