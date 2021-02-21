package cn.lzf.baseball.controller;

import cn.lzf.baseball.service.IScheduleService;
import cn.lzf.baseball.vo.GradeScheduleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
