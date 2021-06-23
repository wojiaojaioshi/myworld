package com.example.bigwork.Dao;

import com.example.bigwork.entities.register;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface register_dao {
    public List<register> getregisterAll();
    public int getregistercount();
    public int deleteregisterbyid(int id);
    public int updateregister(register register);
    public register getregisterbyid(int id);
    public int addregister(register register);
}
