package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.StudentDao;
import cn.lzf.baseball.mapper.StudentMapper;
import cn.lzf.baseball.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<StudentDao> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDao getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/add")
    public int addStudent(@RequestParam String no, @RequestParam String name, @RequestParam long birthdate,
                          @RequestParam int grade) {
        return studentService.addStudent(no, name, new Date(birthdate), grade);
    }

    @GetMapping("/delete/{id}")
    public boolean deleteStudent(@PathVariable("id") int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/change_grade/{id}/{grade}")
    public boolean changeGrade(@PathVariable("id") int id, @PathVariable("grade") int grade) {
        return studentService.changeGrade(id, grade);
    }
}
