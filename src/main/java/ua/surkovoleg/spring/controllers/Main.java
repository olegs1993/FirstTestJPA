package ua.surkovoleg.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.surkovoleg.spring.Dao.GetWeb;

/**
 * Created by Oleg on 05.12.2016.
 */
@Controller
public class Main {

@Autowired
        @Qualifier("GetWeb")
GetWeb getWeb;
    @RequestMapping (value = "/")
    public String main(Model model){
      model.addAttribute("test",getWeb.getWeb().get(0).getName());
        return "home";
    }
}
