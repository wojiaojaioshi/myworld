package com.example.bigwork.Controller;

import com.example.bigwork.Service.register.registerService;
import com.example.bigwork.entities.register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class testController {

@RequestMapping("/grant")
    public String sd()
    {
        return "cao";
    }
}
