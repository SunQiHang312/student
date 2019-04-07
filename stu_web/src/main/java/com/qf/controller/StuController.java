package com.qf.controller;


import com.qf.entity.Student;
import com.qf.service.IStuService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> stus = stuService.queryAll();
        model.addAttribute("stus",stus);
        return "stuList";
    }
}
