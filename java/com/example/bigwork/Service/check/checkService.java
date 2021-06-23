package com.example.bigwork.Service.check;

import com.example.bigwork.entities.check;

import java.util.List;

public interface checkService {
    public List<check> getallcheck();
    public int addcheck(
            String registerid,
            String checktime,
            String checkpay,
            String checkproduct,
            String blood);
    public int delcheckbyid(int id);
    public int upcheckbyid(String checkid,
                           String registerid,
                           String checktime,
                           String checkpay,
                           String checkproduct,
                           String blood);
    public check getcheckbyid(String id);
}
