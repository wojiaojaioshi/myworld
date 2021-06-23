package com.example.bigwork.Dao;

import com.example.bigwork.entities.check;
import com.example.bigwork.entities.worker;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface worker_dao {
    public List<worker> getallworker();
    public int getworkercount();
    public int addworker(worker worker);
    public int delworkerbyid(int id);
    public int upworkerbyid(worker worker);
    public worker getworkerbyid(String id);
    public worker getworkerbyname(String workername);
}
