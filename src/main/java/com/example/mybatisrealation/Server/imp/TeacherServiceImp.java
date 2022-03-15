package com.example.mybatisrealation.Server.imp;

import com.example.mybatisrealation.Server.TeacherServer;
import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Teacher;
import com.example.mybatisrealation.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Service
public class TeacherServiceImp implements TeacherServer {
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> findAllTechers() {
        return teacherMapper.findAllTechers();
    }

    @Override
    public List<St> findview() {
        return teacherMapper.findview();
    }

}
