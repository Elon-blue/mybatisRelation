package com.example.mybatisrealation.Server;

import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Teacher;

import java.util.List;

public interface TeacherServer {
    List<Teacher> findAllTechers();
    List<St> findview();
}
