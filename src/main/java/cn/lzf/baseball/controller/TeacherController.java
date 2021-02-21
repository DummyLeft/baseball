package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.TeacherDao;
import cn.lzf.baseball.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(origins = "*")
public class TeacherController {

    private final ITeacherService teacherService;

    @Autowired
    public TeacherController(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/all")
    public List<TeacherDao> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherDao getTeacherById(@PathVariable("id") int id) {
        return teacherService.getTeacherById(id);
    }

    @GetMapping("/add")
    public int addTeacher(@RequestParam String name, @RequestParam String type) {
        return teacherService.addTeacher(name, type);
    }

    @GetMapping("/delete/{id}")
    public boolean deleteTeacher(@PathVariable("id") int id) {
        return teacherService.deleteTeacher(id);
    }

    @GetMapping("/enable/{id}")
    public boolean enableTeacher(@PathVariable("id") int id) {
        return teacherService.enableTeacher(id);
    }

    @GetMapping("/disable/{id}")
    public boolean disableTeacher(@PathVariable("id") int id) {
        return teacherService.disableTeacher(id);
    }
}
