package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.ClassPerformanceDao;
import cn.lzf.baseball.service.IClassPerformanceService;
import cn.lzf.baseball.vo.ClassPerformanceView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/class_performance")
@CrossOrigin(origins = "*")
public class ClassPerformanceController {

    private final IClassPerformanceService classPerformanceService;

    @Autowired
    public ClassPerformanceController(IClassPerformanceService classPerformanceService) {
        this.classPerformanceService = classPerformanceService;
    }

    @GetMapping("/query")
    public List<ClassPerformanceView> queryClassPerformance(@RequestParam long date) {
        return classPerformanceService.getClassPerformanceByDate(new Date(date));
    }

    @GetMapping("/query_by_student")
    public List<ClassPerformanceDao> queryStudentClassPerformanceInCurrentSchoolYear(@RequestParam int student_id) {
        return classPerformanceService.getStudentClassPerformanceInCurrentSchoolYear(student_id);
    }

    @GetMapping("/add")
    public int addClassPerformance(@RequestParam int student_id, @RequestParam long date, @RequestParam String teacher,
                                   @RequestParam int score, @RequestParam String comment) {
        return classPerformanceService.addClassPerformance(student_id, new Date(date), teacher, score, comment);
    }
}
