package com.example.bigwork.Service.drug;

import com.example.bigwork.Dao.drug_dao;
import com.example.bigwork.entities.drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Druglistimpl implements druglistService {

    @Autowired
    private drug_dao drug_dao;
    @Override
    public List<drug> getalldurg() {
        return drug_dao.getalldurg();
    }

    @Override
    public drug getdrugbyname(String drugname) {
        return drug_dao.getdrugbyname(drugname);
    }

    @Override
    public drug getdrugbyid(String drugid) {
        return drug_dao.getdrugbyid(drugid);
    }

}
