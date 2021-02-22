package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.ProgressDao;
import cn.lzf.baseball.mapper.ProgressMapper;
import cn.lzf.baseball.mapper.SchoolYearMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProgressServiceImpl implements IProgressService {

    @Autowired
    ProgressMapper progressMapper;

    @Autowired
    SchoolYearMapper schoolYearMapper;

    @Override
    public List<ProgressDao> getProgressByDate(Date date) {
        return progressMapper.getProgressByDate(date);
    }

    @Override
    public int addProgress(int grade, String subject, Date date, String teacher, String progress) {
        ProgressDao progressDao = new ProgressDao();
        progressDao.setSchool_year(schoolYearMapper.getCurrentSchoolYear());
        progressDao.setGrade(grade);
        progressDao.setSubject(subject);
        progressDao.setDate(date);
        progressDao.setTeacher(teacher);
        progressDao.setProgress(progress);
        progressMapper.addProgress(progressDao);
        return progressDao.getId();
    }
}
