package com.example.bigwork.Controller;

import com.example.bigwork.Service.register.registerService;
import com.example.bigwork.entities.register;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class Registercontroller {

    @Autowired
    private registerService registerService;

    @RequestMapping("/registerlist")
    public String st(Model mv , HttpServletRequest request)
 {
     Object user = request.getSession().getAttribute("loginid");
     System.out.println(user);
        List<register> register = registerService.getregisterAll();
        int count=registerService.getregistercount();
        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
//        PageHelper.startPage(1,5,true);
//
//        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
//
//        //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>

//
//        //4.使用model/map/modelandview等带回前端
//     PageInfo pageInfo = new PageInfo(register,5);
     if(user!=null)
         mv.addAttribute("user", user.toString());
     mv.addAttribute("registercount", count+"人");
        mv.addAttribute("register", register);

//     mv.addAttribute("pageInfo",pageInfo);
        return "registerlist";
    }

    @RequestMapping("/delregister")
    public String a(Model mv, int id)
    {
        registerService.deleteregisterbyid(id);
        List<register> register = registerService.getregisterAll();
        mv.addAttribute("register", register);
        return "registerlist";
    }

    @RequestMapping("/upregister")
    public String b(Model mv, String registerid,
                    String username,
                    String registertime,
                    String registertype,
                    String registerpay,
                    String rdepartmentid,
                    String identityid,
                    String phone)
    {
        registerService.updateregister( registerid,
                 username,
                 registertime,
                 registertype,
                 registerpay,
                 rdepartmentid,
                 identityid,
                 phone);
        List<register> all = registerService.getregisterAll();
        mv.addAttribute("register", all);
        return "registerlist";
    }
    @RequestMapping("/getregister")
    public String f(Model mv,int id)
    {
        register register=registerService.getregisterbyid(id);
        mv.addAttribute("register", register);
        return "registerlist";
    }
    @RequestMapping("/addregister")
    public String f(Model mv,
                    String username,
                    String registertime,
                    String registertype,
                    String registerpay,
                    String rdepartmentid,
                    String identityid,
                    String phone)
    {
        registerService.addregister(
                username,
                registertime,
                registertype,
                registerpay,
                rdepartmentid,
                 identityid,
                 phone);
        List<register>register=registerService.getregisterAll();
        mv.addAttribute("register", register);
        return "registerlist";
    }
}
