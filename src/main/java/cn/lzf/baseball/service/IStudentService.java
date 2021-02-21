package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.StudentDao;

import java.util.List;

public interface IStudentService {
    List<StudentDao> getAllStudents();
}
