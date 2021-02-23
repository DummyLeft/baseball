package cn.lzf.baseball.service;

import cn.lzf.baseball.vo.GradeScheduleView;

import java.util.List;

public interface IScheduleService {
    List<GradeScheduleView> getAllGradeSchedules();
    int addSchedule(int teacherId, int grade, int dayOfWeek, int classOfDay);
}
