package cn.lzf.baseball.service;

import cn.lzf.baseball.mapper.StudentMapper;
import cn.lzf.baseball.mapper.TeacherMapper;
import cn.lzf.baseball.vo.StaticsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaticsServiceImpl implements IStaticsService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public StaticsView getStatics() {
        StaticsView staticsView = new StaticsView();
        staticsView.setGrades(7);
        staticsView.setStudents(studentMapper.getStudentCount());
        staticsView.setTeachers(teacherMapper.getTeacherCount());
        staticsView.setActiveTeachers(teacherMapper.getActiveTeacherCount());
        staticsView.setVolunteers(teacherMapper.getVolunteerCount());
        return staticsView;
    }
}
