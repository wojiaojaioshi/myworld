package com.example.bigwork.Service.worker;

import com.example.bigwork.entities.check;
import com.example.bigwork.entities.worker;

import java.util.List;

public interface workerService {
    public List<worker> getallworker();
    public int getworkercount();
    public int addworker(
            String workername,
            String identityid,
            String phone,
            String departmentid,
            String post);
    public int delworkerbyid(int id);
    public int upworkerbyid(
            String workerid,
            String workername,
            String identityid,
            String phone,
            String departmentid,
            String post);
    public worker getworkerbyid(String id);
    public worker getworkerbyname(String workername);
}
