package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.ProgressDao;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface ProgressMapper {

    @Select("SELECT * FROM progress WHERE date=#{date}")
    List<ProgressDao> getProgressByDate(Date date);

    @Select("SELECT * FROM progress WHERE school_year=#{school_year} AND grade=#{grade} AND subject=#{subject} ORDER BY `date` DESC")
    List<ProgressDao> getProgressByGradeAndSubject(@Param("school_year") String schoolYear, @Param("grade") int grade, @Param("subject") String subject);

    @Insert("INSERT INTO progress (school_year, grade, subject, date, teacher, progress) " +
            "VALUES (#{school_year}, #{grade}, #{subject}, #{date}, #{teacher}, #{progress}) " +
            "ON DUPLICATE KEY UPDATE teacher=#{teacher}, progress=#{progress}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addProgress(ProgressDao progress);
}
