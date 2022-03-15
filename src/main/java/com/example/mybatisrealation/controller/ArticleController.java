package com.example.mybatisrealation.controller;

import com.example.mybatisrealation.Server.AricleServer;
import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.Category;
import com.example.mybatisrealation.config.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private AricleServer aricleServer;
    @RequestMapping("/get")
    @Log("获取方法被执行了")
    public Aricle get(String id){
        return  aricleServer.findAricleById(id);
    }
    @RequestMapping("/getAllCategory")
    public List<Category> getAllCategory(String id){
        return  aricleServer.findAllCategorys();
    }
}
