package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

import java.util.List;

public interface StuMapper extends BaseMapper<Student> {
    List<Student> queryAll();
}
