package cn.lzf.baseball.controller;

import cn.lzf.baseball.service.IScheduleService;
import cn.lzf.baseball.vo.GradeScheduleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@CrossOrigin(origins = "*")
public class ScheduleController {

    private final IScheduleService scheduleService;

    @Autowired
    public ScheduleController(IScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/all")
    public List<GradeScheduleView> getAllGradeSchedules() {
        return scheduleService.getAllGradeSchedules();
    }

    @GetMapping("/add")
    public int addSchedule(@RequestParam int teacher_id, @RequestParam int grade, @RequestParam int day_of_week) {
        return scheduleService.addSchedule(teacher_id, grade, day_of_week, 0);
    }
}
