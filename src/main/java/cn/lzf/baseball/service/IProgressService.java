package cn.lzf.baseball.service;

import cn.lzf.baseball.dao.ProgressDao;

import java.util.Date;
import java.util.List;

public interface IProgressService {
    List<ProgressDao> getProgressByDate(Date date);
    int addProgress(int grade, String subject, Date date, String teacher, String progress);
}
