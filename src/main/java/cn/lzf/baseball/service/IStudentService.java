package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.StudentDao;

import java.util.Date;
import java.util.List;

public interface IStudentService {
    List<StudentDao> getAllStudents();
    StudentDao getStudentById(int id);
    int addStudent(String no, String name, Date birthdate, int grade);
    boolean deleteStudent(int id);
    boolean changeGrade(int id, int grade);
}
