package com.example.bigwork.Controller;



import com.example.bigwork.Service.drug.druglistService;
import com.example.bigwork.Service.outdrug.drugService;

import com.example.bigwork.entities.drug;
import com.example.bigwork.entities.outdrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DrugController {
    @Autowired
    private drugService drugService;
    @Autowired
    private druglistService druglistService;

    @RequestMapping( "/outdruglist")
    public String st(Model mv, HttpServletRequest request) {
        List<outdrug> outdrugs = drugService.getoutdrugAll();
        List<drug> drugs =druglistService.getalldurg();
        Object user = request.getSession().getAttribute("loginid");
        int count=drugService.getoutdrugcount();
        mv.addAttribute("druglist", drugs);
        mv.addAttribute("user", user);
        mv.addAttribute("outdrugcount", count+"单");
        mv.addAttribute("outdruglist", outdrugs);
        return "druglist";
    }
//
    @RequestMapping("/deloutdurg")
    public String a(Model mv, int id)
    {
        drugService.deleteroutdrugbyid(id);
        List<outdrug> outdrugList = drugService.getoutdrugAll();
        mv.addAttribute("outdruglist", outdrugList);
        return "druglist";
    }
//
    @RequestMapping("/upoutdrug")
    public String b(Model mv,
                    String  outdrugid,
                    String  registerid,
                    String   drugnum,
                    String   drugprice,
                    String  drugcause,
                    String  drugid)
    {
        drugService.updateoutdrug(outdrugid, registerid, drugnum, drugprice, drugcause,drugid);

        List<outdrug> all =drugService.getoutdrugAll();
        mv.addAttribute("outdruglist", all);
        return "druglist";
    }
    @RequestMapping("/getdrug")
    public String f(Model mv,String id)
    {
        outdrug outdrug=drugService.getoutdrugbyid(id);
        mv.addAttribute("outdruglist", outdrug);
        return "druglist";
    }
    @RequestMapping("/addoutdrug")
    public String f(Model mv,
                    String  registerid,
                    String   drugnum,
                    String  drugcause,
                    String  drugid)
    {
        drug drug=druglistService.getdrugbyid(drugid);
        int danjia=Integer.valueOf(drug.getDrugdanjia());
        int num=Integer.valueOf(drugnum);
        String drugprice=String.valueOf(danjia*num);
        System.out.println(registerid+drugnum+drugprice+drugcause+drugid);
        drugService.addoutdrug(
                registerid,
                drugnum,
                drugprice,
                drugcause,
                drugid);

        List<outdrug>outdrugList= drugService.getoutdrugAll();
        mv.addAttribute("outdruglist", outdrugList);
        return "druglist";
    }
}
