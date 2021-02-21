package cn.lzf.baseball.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ScheduleView {
    private int id;
    private int teacher_id;
    private String teacher_name;
    private int grade;
    private int day_of_week;
    private int class_of_day;
}
