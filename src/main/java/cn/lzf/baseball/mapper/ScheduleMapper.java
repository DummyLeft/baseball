package cn.lzf.baseball.mapper;

import cn.lzf.baseball.vo.ScheduleView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScheduleMapper {

    @Select("SELECT s.id, s.teacher_id, t.name as teacher_name, s.grade, s.day_of_week, s.class_of_day FROM schedule s LEFT JOIN teacher t ON s.teacher_id = t.id")
    List<ScheduleView> getAllSchedules();
}
