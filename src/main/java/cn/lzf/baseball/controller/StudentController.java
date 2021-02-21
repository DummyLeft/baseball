package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.StudentDao;
import cn.lzf.baseball.mapper.StudentMapper;
import cn.lzf.baseball.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

    private final IStudentService studentService;

    StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<StudentDao> getAllStudents() {
        return studentService.getAllStudents();
    }
}
