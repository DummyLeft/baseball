package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.ClassPerformanceDao;
import cn.lzf.baseball.mapper.ClassPerformanceMapper;
import cn.lzf.baseball.mapper.SchoolYearMapper;
import cn.lzf.baseball.vo.ClassPerformanceView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClassPerformanceServiceImpl implements IClassPerformanceService {

    @Autowired
    ClassPerformanceMapper classPerformanceMapper;

    @Autowired
    SchoolYearMapper schoolYearMapper;

    @Override
    public List<ClassPerformanceView> getClassPerformanceByDate(Date date) {
        return classPerformanceMapper.getClassPerformanceByDate(date);
    }

    @Override
    public int addClassPerformance(int studentId, Date date, String teacher, int score, String comment) {
        ClassPerformanceDao classPerformance = new ClassPerformanceDao();
        classPerformance.setSchool_year(schoolYearMapper.getCurrentSchoolYear());
        classPerformance.setStudent_id(studentId);
        classPerformance.setDate(date);
        classPerformance.setTeacher(teacher);
        classPerformance.setScore(score);
        classPerformance.setComment(comment);
        classPerformanceMapper.addProgress(classPerformance);
        return classPerformance.getId();
    }

    @Override
    public List<ClassPerformanceDao> getStudentClassPerformanceInCurrentSchoolYear(int studentId) {
        return classPerformanceMapper.getPerformanceByStudentIdAndSchoolYear(studentId, schoolYearMapper.getCurrentSchoolYear());
    }
}
