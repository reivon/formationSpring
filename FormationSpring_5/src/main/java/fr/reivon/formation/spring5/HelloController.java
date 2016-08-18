package fr.reivon.formation.spring5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

    @RequestMapping(value= "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        return "hello";
    }

}
