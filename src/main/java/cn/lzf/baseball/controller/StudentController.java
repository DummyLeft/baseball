package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.StudentDao;
import cn.lzf.baseball.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/test")
    public StudentDao test() {
        return studentMapper.getStudentById(1);
    }
}
