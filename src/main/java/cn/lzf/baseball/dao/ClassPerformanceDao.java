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
public class ClassPerformanceDao {
    private int id;
    private String school_year;
    private int student_id;
    private Date date;
    private String teacher;
    private int score;
    private String comment;
}
