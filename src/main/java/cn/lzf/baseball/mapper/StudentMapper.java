package cn.lzf.baseball.mapper;

import cn.lzf.baseball.dao.StudentDao;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id=${id}")
    StudentDao getStudentById(@Param("id") int id);

    @Select("SELECT * FROM student")
    List<StudentDao> getAllStudents();

    @Insert("INSERT INTO student(no, name, birthdate, grade) VALUES (#{no}, #{name}, #{birthdate}, #{grade})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addStudent(StudentDao student);

    @Delete("DELETE FROM student WHERE id=#{id}")
    void deleteStudent(int id);

    @Update("UPDATE student SET grade=#{grade} WHERE id=#{id}")
    void changeGrade(@Param("id") int id, @Param("grade") int grade);

    @Select("SELECT COUNT(1) FROM student")
    int getStudentCount();
}
