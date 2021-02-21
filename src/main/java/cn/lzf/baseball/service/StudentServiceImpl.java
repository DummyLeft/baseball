package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.StudentDao;
import cn.lzf.baseball.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDao> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    @Override
    public StudentDao getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public int addStudent(String no, String name, Date birthdate, int grade) {
        StudentDao student = new StudentDao();
        student.setNo(no);
        student.setName(name);
        student.setBirthdate(birthdate);
        student.setGrade(grade);
        studentMapper.addStudent(student);
        return student.getId();
    }

    @Override
    public boolean deleteStudent(int id) {
        studentMapper.deleteStudent(id);
        return true;
    }

    @Override
    public boolean changeGrade(int id, int grade) {
        studentMapper.changeGrade(id, grade);
        return true;
    }
}
