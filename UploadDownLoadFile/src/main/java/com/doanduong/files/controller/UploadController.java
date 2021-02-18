package com.doanduong.files.controller;

import com.doanduong.files.model.MyFile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.io.File;
import java.util.Date;

@Controller
public class UploadController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("myFile", new MyFile());
        return "index";
    }
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(MyFile myfile, Model model) {
        model.addAttribute("message","upload success");
        model.addAttribute("description", myfile.getDescription());

        // Chuyển file upload đến thư mục
        try {
            MultipartFile multipartFile = myfile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            File file = new File(getFolderUpload(), fileName);
            multipartFile.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "upload failed!");
        }
        return "result";
    }

    // tạo đường dẫn và thư mục cho từng file upload
    public static final String SAVE_DIRECTORY = "testUploadFiles";

    public File getFolderUpload() {
        String appPath = "D:\\MultipleTest\\";

        appPath += SAVE_DIRECTORY + File.separator + new Date().getTime();
        File file = new File(appPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    // Upload file with progressbar
    @RequestMapping(value = "/uploadFileProgressBar", method = RequestMethod.POST)
    public ResponseEntity<String> uploadFileProgressBar(MyFile myFile) {
        try {
            MultipartFile multipartFile = myFile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            File file = new File("D:/files", fileName);
            multipartFile.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("failed: "+e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>("success",HttpStatus.OK);
    }
}
