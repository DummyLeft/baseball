package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.TeacherDao;

import java.util.List;

public interface ITeacherService {
    List<TeacherDao> getAllTeachers();
    TeacherDao getTeacherById(int id);
    int addTeacher(String name, String type);
    boolean deleteTeacher(int id);
    boolean enableTeacher(int id);
    boolean disableTeacher(int id);
}
