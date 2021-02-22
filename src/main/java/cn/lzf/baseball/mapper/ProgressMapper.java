package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.ProgressDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface ProgressMapper {

    @Select("SELECT * FROM progress WHERE date=#{date}")
    List<ProgressDao> getProgressByDate(Date date);

    @Insert("INSERT INTO progress (school_year, grade, subject, date, teacher, progress) " +
            "VALUES (#{school_year}, #{grade}, #{subject}, #{date}, #{teacher}, #{progress})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addProgress(ProgressDao progress);
}
