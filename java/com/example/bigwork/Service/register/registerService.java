package com.example.bigwork.Service.register;

import com.example.bigwork.entities.register;

import java.util.List;

public interface registerService {
    public List<register> getregisterAll();
    public int getregistercount();
    public int deleteregisterbyid(int id);
    public int updateregister(String registerid,
                              String userid,
                              String registertime,
                              String registertype,
                              String registerpay,
                              String rdepartmentid,
                              String identityid,
                              String phone);
    public register getregisterbyid(int id);
    public int addregister(
                           String userid,
                           String registertime,
                           String registertype,
                           String registerpay,
                           String rdepartmentid,
                           String identityid,
                           String phone);
}
