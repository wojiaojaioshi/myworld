package com.example.bigwork.Dao;

import com.example.bigwork.entities.outdrug;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface outdrug_dao {
    public List<outdrug> getoutdrugAll();
    public int getoutdrugcount();
    public int deleteroutdrugbyid(int id);
    public int updatedrug(outdrug drug);
    public outdrug getoutdrugbyid(String id);
    public int addoutdrug(outdrug drug);
}
