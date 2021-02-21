package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.TeacherDao;
import cn.lzf.baseball.mapper.ScheduleMapper;
import cn.lzf.baseball.vo.GradeScheduleView;
import cn.lzf.baseball.vo.ScheduleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ScheduleServiceImpl implements IScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public List<GradeScheduleView> getAllGradeSchedules() {
        List<ScheduleView> scheduleViews = scheduleMapper.getAllSchedules();
        Map<Integer,GradeScheduleView> gradeScheduleViewMap = new HashMap<>();
        scheduleViews.forEach(scheduleView -> {
            if (!gradeScheduleViewMap.containsKey(scheduleView.getGrade())) {
                GradeScheduleView gradeScheduleView = new GradeScheduleView();
                gradeScheduleView.setSchedule(new HashMap<>());
                gradeScheduleView.setGrade(scheduleView.getGrade());
                gradeScheduleViewMap.put(scheduleView.getGrade(), gradeScheduleView);
            }
            GradeScheduleView view = gradeScheduleViewMap.get(scheduleView.getGrade());
            TeacherDao teacher = new TeacherDao();
            teacher.setId(scheduleView.getTeacher_id());
            teacher.setName(scheduleView.getTeacher_name());
            view.getSchedule().put(scheduleView.getDay_of_week(), teacher);
        });
        return new ArrayList<>(gradeScheduleViewMap.values());
    }
}
