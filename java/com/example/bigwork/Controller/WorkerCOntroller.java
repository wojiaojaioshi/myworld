package com.example.bigwork.Controller;

import com.example.bigwork.Service.check.checkService;
import com.example.bigwork.Service.worker.workerService;
import com.example.bigwork.entities.check;
import com.example.bigwork.entities.worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkerCOntroller {
    @Autowired
    private workerService workerService;

    @RequestMapping("/workerlist")
    public String st(Model mv, HttpServletRequest request) {
        List<worker> workers = workerService.getallworker();
        Object user = request.getSession().getAttribute("loginid");
        List<String> key=new ArrayList<String>();
        key.add("1900300717");
        key.add("1901420313");
        key.add("1900300722");
        if(!key.contains(user))
        {
            return "404";
        }
        int count=workerService.getworkercount();
        mv.addAttribute("user",user);
        mv.addAttribute("workercoutn", count+"人");
        mv.addAttribute("workerlist", workers);
        return "workerlist";
    }
    //
    @RequestMapping("/delworker")
    public String a(Model mv, int id)
    {
        workerService.delworkerbyid(id);
        List<worker> workers=workerService.getallworker();
        mv.addAttribute("workerlist", workers);
        return "workerlist";
    }
    //
    @RequestMapping("/upworker")
    public String b(Model mv,
                    String workerid,
                    String workername,
                    String identityid,
                    String phone,
                    String departmentid,
                    String post)
    {
        workerService.upworkerbyid( workerid,
                 workername,
                 identityid,
                 phone,
                 departmentid,
                 post);

        List<worker> all =workerService.getallworker();
        mv.addAttribute("workerlist", all);
        return "workerlist";
    }
    @RequestMapping("/getworker")
    public String f(Model mv,String id)
    {
        worker worker=workerService.getworkerbyid(id);
        mv.addAttribute("workerlist", worker);
        return "workerlist";
    }
    @RequestMapping("/addworker")
    public String f(Model mv,
                    String workername,
                    String identityid,
                    String phone,
                    String departmentid,
                    String post)
    {
        workerService.addworker(
                workername,
                identityid,
                phone,
                departmentid,
                post);

        List<worker>workers= workerService.getallworker();
        mv.addAttribute("workerlist", workers);
        return "workerlist";
    }
}
