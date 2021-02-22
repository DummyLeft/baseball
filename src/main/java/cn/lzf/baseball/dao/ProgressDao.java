package cn.lzf.baseball.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProgressDao {
    private int id;
    private String school_year;
    private int grade;
    private String subject;
    private Date date;
    private String teacher;
    private String progress;
}
