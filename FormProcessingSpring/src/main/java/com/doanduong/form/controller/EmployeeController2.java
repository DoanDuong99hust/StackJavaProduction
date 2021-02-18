package com.doanduong.form.controller;

import com.doanduong.form.entities.Employee2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController2 {
    @RequestMapping(value = {"/", "/addEmployee2"}, method = RequestMethod.GET)
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee2());

        List<String> listFavorite = new ArrayList<String>();
        listFavorite.add("Swimming");
        listFavorite.add("Listening music");
        listFavorite.add("Walking");
        listFavorite.add("Watching movie");
        listFavorite.add("Reading comic");
        model.addAttribute("listFavorite", listFavorite);

        List<String> listPosition = new ArrayList<String>();
        listPosition.add("Developer");
        listPosition.add("Designer");
        listPosition.add("Tester");
        listPosition.add("QA");
        model.addAttribute("listFavorite", listFavorite);
        model.addAttribute("listPosition", listPosition);
        return "add-employee2";
    }

    @RequestMapping(value = "/addEmployee2", method = RequestMethod.POST)
    public String doAddEmployee(@ModelAttribute("employee2") Employee2 employee2, ModelMap modelMap) {
        modelMap.addAttribute("employee2", employee2);
        return "view-employee2";
    }

}
