package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.StudentDao;
import cn.lzf.baseball.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDao> getAllStudents() {
        return studentMapper.getAllStudents();
    }
}
