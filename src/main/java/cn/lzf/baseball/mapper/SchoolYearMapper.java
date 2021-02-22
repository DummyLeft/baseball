package cn.lzf.baseball.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SchoolYearMapper {

    @Select("SELECT school_year FROM current_school_year LIMIT 1")
    String getCurrentSchoolYear();
}
