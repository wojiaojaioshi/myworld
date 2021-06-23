package com.example.bigwork.Controller;

import com.example.bigwork.Service.login.loginService;
import com.example.bigwork.entities.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class loginController {
@Autowired
private loginService loginService;

@RequestMapping("/tologin")
public String sa()
{
    return "login";
}
@RequestMapping("/login")
    public String a( String loginid, String password,HttpSession session)
{

    login login=loginService.querylogin(loginid, password);
    System.out.println(login);
    if(login==null)
    {

        return "login";
    }

    else
    {
        session.setAttribute("loginid", loginid);
        System.out.println(loginid);

        return "redirect:/registerlist";
    }

}
@RequestMapping("/toregister")
    public String a()
{
    return "register";
}
@RequestMapping("/register")
    public String jk(String loginid,String password,String workerid)
{
    loginService.addloginuser(loginid, password, workerid);
    return "login";
}
    @RequestMapping("/logout")
    public String sd(HttpServletRequest request) {
        HttpSession session = request.getSession();//获取当前session
        if (session != null) {
            session.invalidate();//关闭session
        }
        return "login";
    }
    @RequestMapping("/uplogin")
    public String ad(String loginid,String password,String workerid)
    {
        loginService.updatelogin(loginid, password, workerid);
        return "redirect:/workerlist";
    }

}
