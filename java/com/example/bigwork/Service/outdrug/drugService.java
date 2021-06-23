package com.example.bigwork.Service.outdrug;

import com.example.bigwork.entities.outdrug;
import com.example.bigwork.entities.register;

import java.util.List;

public interface drugService {
    public List<outdrug> getoutdrugAll();
    public int getoutdrugcount();
    public int deleteroutdrugbyid(int id);
    public int updateoutdrug(String  outdrugid,
                              String  registerid,
                             String   drugnum,
                             String   drugprice,
                              String  drugcause,
                             String  drugid);
    public outdrug getoutdrugbyid(String id);
    public int addoutdrug(
                          String  registerid,
                          String   drugnum,
                          String   drugprice,
                          String  drugcause,
                          String  drugid);
}
