package com.example.mybatisrealation.Server.imp;

import com.example.mybatisrealation.Server.AricleServer;
import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.Category;
import com.example.mybatisrealation.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Service
public class AticleServiceImp implements AricleServer {
    @Resource
    private ArticleMapper articleMapper;
    @Override
    public Aricle findAricleById(String id) {
        return articleMapper.findAricleById(id);
    }

    @Override
    public List<Category> findAllCategorys() {
        return articleMapper.findAllCategorys();
    }
}
