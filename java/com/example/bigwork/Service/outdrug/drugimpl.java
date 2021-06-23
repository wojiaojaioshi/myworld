package com.example.bigwork.Service.outdrug;

import com.example.bigwork.Dao.outdrug_dao;
import com.example.bigwork.entities.outdrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class drugimpl implements drugService{
    @Autowired
   private outdrug_dao  outdrug_dao;

    @Override
    public List<outdrug> getoutdrugAll() {
        return outdrug_dao.getoutdrugAll();
    }

    @Override
    public int getoutdrugcount() {
        return outdrug_dao.getoutdrugcount();
    }

    @Override
    public int deleteroutdrugbyid(int id) {
        return outdrug_dao.deleteroutdrugbyid(id);
    }

    @Override
    public int updateoutdrug(String outdrugid, String registerid, String drugnum, String drugprice, String drugcause,String drugid) {
        outdrug outdrug=new outdrug();
        outdrug.setDrugcause(drugcause);
        outdrug.setDrugnum(drugnum);
        outdrug.setDrugprice(drugprice);
        outdrug.setRegisterid(registerid);
        outdrug.setOutdrugid(outdrugid);
        return outdrug_dao.updatedrug(outdrug);
    }

    @Override
    public outdrug getoutdrugbyid(String id) {
        outdrug outdrug=outdrug_dao.getoutdrugbyid(id);
        return outdrug;
    }

    @Override
    public int addoutdrug( String registerid, String drugnum, String drugprice, String drugcause,String drugid) {
        outdrug outdrug=new outdrug();
        outdrug.setDrugcause(drugcause);
        outdrug.setDrugnum(drugnum);
        outdrug.setDrugprice(drugprice);
        outdrug.setRegisterid(registerid);
        outdrug.setDrugid(drugid);
        return outdrug_dao.addoutdrug(outdrug);
    }
}
