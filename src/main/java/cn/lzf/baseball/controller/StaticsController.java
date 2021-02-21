package cn.lzf.baseball.controller;

import cn.lzf.baseball.service.IStaticsService;
import cn.lzf.baseball.vo.StaticsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statics")
@CrossOrigin(origins = "*")
public class StaticsController {

    private final IStaticsService staticsService;

    @Autowired
    public StaticsController(IStaticsService staticsService) {
        this.staticsService = staticsService;
    }

    @GetMapping("/overall")
    public StaticsView getOverallStatics() {
        return staticsService.getStatics();
    }
}
