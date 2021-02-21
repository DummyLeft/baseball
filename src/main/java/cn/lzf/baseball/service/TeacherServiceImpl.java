package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.TeacherDao;
import cn.lzf.baseball.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService{

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<TeacherDao> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    public TeacherDao getTeacherById(int id) {
        return teacherMapper.getTeacherById(id);
    }

    @Override
    public int addTeacher(String name, String type) {
        TeacherDao teacher = new TeacherDao();
        teacher.setName(name);
        teacher.setType(type == null ? "志愿者" : type);
        teacherMapper.addTeacher(teacher);
        return teacher.getId();
    }

    @Override
    public boolean deleteTeacher(int id) {
        teacherMapper.deleteTeacher(id);
        return true;
    }

    @Override
    public boolean enableTeacher(int id) {
        teacherMapper.enableTeacher(id);
        return true;
    }

    @Override
    public boolean disableTeacher(int id) {
        teacherMapper.disableTeacher(id);
        return true;
    }
}
