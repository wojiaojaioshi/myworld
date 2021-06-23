package com.example.bigwork.Dao;

import com.example.bigwork.entities.check;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface check_dao {
    public List<check> getallcheck();
    public int addcheck(check check);
    public int delcheckbyid(int id);
    public int upcheckbyid(check check);
    public check getcheckbyid(String id);
}
