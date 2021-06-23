package com.example.bigwork.Service.worker;

import com.example.bigwork.Dao.worker_dao;
import com.example.bigwork.entities.check;
import com.example.bigwork.entities.worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class workerimpl implements workerService{
    @Autowired
    private worker_dao worker_dao;

    @Override
    public List<worker> getallworker() {
        return worker_dao.getallworker();
    }

    @Override
    public int getworkercount() {
        return worker_dao.getworkercount();
    }

    @Override
    public int addworker(String workername, String identityid, String phone, String departmentid, String post) {
      worker worker=new worker();
      worker.setWorkername(workername);
      worker.setIdentityid(identityid);
      worker.setPhone(phone);
      worker.setPost(post);
      worker.setDepartmentid(departmentid);
      return worker_dao.addworker(worker);
    }

    @Override
    public int delworkerbyid(int id) {

        return worker_dao.delworkerbyid(id);
    }

    @Override
    public int upworkerbyid(String workerid, String workername, String identityid, String phone, String departmentid, String post) {
        worker worker=new worker();
        worker.setWorkerid(workerid);
        worker.setWorkername(workername);
        worker.setIdentityid(identityid);
        worker.setPhone(phone);
        worker.setPost(post);
        worker.setDepartmentid(departmentid);
        return worker_dao.upworkerbyid(worker);
    }

    @Override
    public worker getworkerbyid(String id) {

        return worker_dao.getworkerbyid(id);
    }
    @Override
    public worker getworkerbyname(String workername) {

        return worker_dao.getworkerbyname(workername);
    }
}
