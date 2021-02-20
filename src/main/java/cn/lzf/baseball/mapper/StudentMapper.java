package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.StudentDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {

    @Select("select * from student where id=${id}")
    StudentDao getStudentById(@Param("id") int id);
}