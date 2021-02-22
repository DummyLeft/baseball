package cn.lzf.baseball.controller;

import cn.lzf.baseball.dao.ProgressDao;
import cn.lzf.baseball.service.IProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/progress")
@CrossOrigin(origins = "*")
public class ProgressController {

    private final IProgressService progressService;

    @Autowired
    public ProgressController(IProgressService progressService) {
        this.progressService = progressService;
    }

    @GetMapping("/query")
    public List<ProgressDao> queryProgress(@RequestParam long date) {
        return progressService.getProgressByDate(new Date(date));
    }

    @GetMapping("/add")
    public int addProgress(@RequestParam int grade, @RequestParam String subject, @RequestParam String teacher,
                           @RequestParam long date, @RequestParam String progress) {
        return progressService.addProgress(grade, subject, new Date(date), teacher, progress);
    }
}
