package com.example.bigwork.Controller;

import com.example.bigwork.Service.user.userService;
import com.example.bigwork.Service.worker.workerService;
import com.example.bigwork.entities.user;
import com.example.bigwork.entities.worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class userController {
    @Autowired
    private userService userService;
    @Autowired
    private workerService workerService;

    @RequestMapping("/userlist")
    public String st(Model mv, HttpServletRequest request) {
        List<user> users = userService.getuserAll();
        Object user = request.getSession().getAttribute("loginid");
        int count=userService.getusercount();
        mv.addAttribute("user",user);
        mv.addAttribute("usercoutn", count+"人");
        mv.addAttribute("userlist", users);
        return "userlist";
    }
    //
    @RequestMapping("/deluser")
    public String a(Model mv, int id)
    {
        userService.deleteuserbyid(id);
        List<user> users=userService.getuserAll();
        mv.addAttribute("userlist", users);
        return "userlist";
    }
    //
    @RequestMapping("/upuser")
    public String b(Model mv,
                    String id,
                    String identityid,
                    String phone,
                    String username,
                    String checked,
                    String registerid,
                    String hosped,
                    String workername)
    {
        worker worker=workerService.getworkerbyname(workername);
        userService.updateuser(id,identityid,phone,username,checked,registerid,hosped,
                worker.getWorkerid());

        List<user> all =userService.getuserAll();
        mv.addAttribute("userlist", all);
        return "userlist";
    }
    @RequestMapping("/getuser")
    public String f(Model mv,String id)
    {
       user user=userService.getuserbyid(id);
        mv.addAttribute("userlist", user);
        return "userlist";
    }
    @RequestMapping("/adduser")
    public String f(Model mv,
                    String identityid,
                    String phone,
                    String username,
                    String checked,
                    String registerid,
                    String hosped,
                    String workername)
    {
        worker worker=workerService.getworkerbyname(workername);
            userService.adduser(
                    identityid,
                    phone,
                    username,
                    checked,
                    registerid,
                    hosped,
                    worker.getWorkerid());

        List<user>users= userService.getuserAll();
        mv.addAttribute("userlist", users);
        return "userlist";
    }
}
