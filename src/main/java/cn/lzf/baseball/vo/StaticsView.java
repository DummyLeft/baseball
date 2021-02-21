package cn.lzf.baseball.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StaticsView {
    private int grades;
    private int teachers;
    private int activeTeachers;
    private int volunteers;
    private int students;
}
