package com.example.bigwork.Service.check;

import com.example.bigwork.Dao.check_dao;
import com.example.bigwork.entities.check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class checkimpl implements checkService{
    @Autowired
    private check_dao check_dao;
    @Override
    public List<check> getallcheck() {
        return check_dao.getallcheck();
    }

    @Override
    public int addcheck( String registerid, String checktime, String checkpay,String checkproduct,String blood) {
        check check=new check();
        check.setCheckpay(checkpay);
        check.setChecktime(checktime);
        check.setRegisterid(registerid);
        check.setCheckproduct(checkproduct);
        check.setBlood(blood);
        return check_dao.addcheck(check);
    }

    @Override
    public int delcheckbyid(int id) {
        return check_dao.delcheckbyid(id);
    }

    @Override
    public int upcheckbyid(String checkid, String registerid, String checktime, String checkpay,String checkproduct,String blood) {
        check check=new check();
        check.setBlood(blood);
        check.setCheckid(checkid);
        check.setCheckpay(checkpay);
        check.setChecktime(checktime);
        check.setRegisterid(registerid);
        check.setCheckproduct(checkproduct);
        return check_dao.upcheckbyid(check);
    }

    @Override
    public check getcheckbyid(String id) {
        return check_dao.getcheckbyid(id);
    }
}
