package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.ClassPerformanceDao;
import cn.lzf.baseball.vo.ClassPerformanceView;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface ClassPerformanceMapper {

    @Select("SELECT p.*, s.name AS student_name, s.grade FROM class_performance p LEFT JOIN student s ON p.student_id = s.id WHERE date=#{date}")
    List<ClassPerformanceView> getClassPerformanceByDate(Date date);

    @Insert("INSERT INTO class_performance (school_year, student_id, date, teacher, score, comment) " +
            "VALUES (#{school_year}, #{student_id}, #{date}, #{teacher}, #{score}, #{comment}) " +
            "ON DUPLICATE KEY UPDATE teacher=#{teacher}, score=#{score}, comment=#{comment}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addProgress(ClassPerformanceDao classPerformance);

    @Select("SELECT * FROM class_performance WHERE student_id=#{id} AND school_year=#{school_year}")
    List<ClassPerformanceDao> getPerformanceByStudentIdAndSchoolYear(@Param("id") int id, @Param("school_year") String schoolYear);
}
