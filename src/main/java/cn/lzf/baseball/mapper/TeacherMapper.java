package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.TeacherDao;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Select("SELECT * FROM teacher")
    List<TeacherDao> getAllTeachers();

    @Select("SELECT * FROM teacher WHERE id=#{id}")
    TeacherDao getTeacherById(int id);

    @Insert("INSERT INTO teacher(name, type) VALUES (#{name}, #{type})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addTeacher(TeacherDao teacher);

    @Delete("DELETE FROM teacher WHERE id=#{id}")
    void deleteTeacher(int id);

    @Update("UPDATE teacher SET active=true WHERE id=#{id}")
    void enableTeacher(int id);

    @Update("UPDATE teacher SET active=false WHERE id=#{id}")
    void disableTeacher(int id);

    @Select("SELECT COUNT(1) FROM teacher")
    int getTeacherCount();

    @Select("SELECT COUNT(1) FROM teacher WHERE active=true")
    int getActiveTeacherCount();

    @Select("SELECT COUNT(1) FROM teacher WHERE `type`='志愿者'")
    int getVolunteerCount();
}
