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
public class StudentDao {
    private int id;
    private String no;
    private String name;
    private Date birthdate;
    private int grade;
}
