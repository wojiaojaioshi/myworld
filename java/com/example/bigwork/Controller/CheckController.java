package com.example.bigwork.Controller;

import com.example.bigwork.Service.check.checkService;
import com.example.bigwork.Service.outdrug.drugService;
import com.example.bigwork.entities.check;
import com.example.bigwork.entities.outdrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CheckController {
    @Autowired
    private checkService checkService;

    @RequestMapping("/checklist")
    public String st(Model mv, HttpServletRequest request) {
        List<check> checks = checkService.getallcheck();
        Object user = request.getSession().getAttribute("loginid");
        mv.addAttribute("checklist", checks);
        mv.addAttribute("user", user);
        return "checklist";
    }
    //
    @RequestMapping("/delcheck")
    public String a(Model mv, int id)
    {
        checkService.delcheckbyid(id);
        List<check> checks =checkService.getallcheck();
        mv.addAttribute("checklist", checks);
        return "checklist";
    }
    //
    @RequestMapping("/upcheck")
    public String b(Model mv,
                    String checkid,
                    String registerid,
                    String checktime,
                    String checkpay,
                    String checkproduct,
                    String blood)
    {
        checkService.upcheckbyid(checkid,registerid,checktime,checkpay,checkproduct,blood);

        List<check> all =checkService.getallcheck();
        mv.addAttribute("checklist", all);
        return "checklist";
    }
    @RequestMapping("/getcheck")
    public String f(Model mv,String id)
    {
        check check=checkService.getcheckbyid(id);
        mv.addAttribute("checklist", check);
        return "checklist";
    }
    @RequestMapping("/addcheck")
    public String f(Model mv,
                    String registerid,
                    String checktime,
                    String checkpay,
                    String checkproduct,String blood)
    {
        checkService.addcheck(registerid,checktime,checkpay,checkproduct,blood);

        List<check>checks= checkService.getallcheck();
        mv.addAttribute("checklist", checks);
        return "checklist";
    }
}
