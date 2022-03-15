package com.example.mybatisrealation.controller;

import com.example.mybatisrealation.Server.TeacherServer;
import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Teacher;
import com.example.mybatisrealation.config.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherServer teacherServer;
    @RequestMapping("/list")
    public List<Teacher> lists(){
        return  teacherServer.findAllTechers();
    }

    @RequestMapping("/view")
    @Log("老师类中的视图方法")
    public List<St> view(){
        return  teacherServer.findview();
    }

}
