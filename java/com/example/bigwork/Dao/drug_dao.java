package com.example.bigwork.Dao;

import com.example.bigwork.entities.drug;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface drug_dao {
    public List<drug> getalldurg();
    public drug getdrugbyname(String drugname);
    public drug getdrugbyid(String drugid);
}
