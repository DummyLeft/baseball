package cn.lzf.baseball.vo;

import cn.lzf.baseball.dao.TeacherDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GradeScheduleView {
    private int grade;
    private Map<Integer, TeacherDao> schedule;
}
