package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.ClassPerformanceDao;
import cn.lzf.baseball.vo.ClassPerformanceView;

import java.util.Date;
import java.util.List;

public interface IClassPerformanceService {
    List<ClassPerformanceView> getClassPerformanceByDate(Date date);
    int addClassPerformance(int studentId, Date date, String teacher, int score, String comment);
    List<ClassPerformanceDao> getStudentClassPerformanceInCurrentSchoolYear(int studentId);
}
