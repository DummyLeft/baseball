package cn.lzf.baseball.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ScheduleDao {
    private int id;
    private int teacher_id;
    private int grade;
    private int day_of_week;
    private int class_of_day;
}
