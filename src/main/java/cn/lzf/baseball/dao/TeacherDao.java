package cn.lzf.baseball.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeacherDao {
    private int id;
    private String name;
    private String type;
    private boolean active;
}
