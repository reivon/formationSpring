package fr.reivon.formation.spring8c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class AjaxController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String calcForm(){
        return "calcForm";
    }

    @ResponseBody
    @RequestMapping(value = "addAjax", method = RequestMethod.POST)
    public FormCalc add(@RequestBody FormCalc form) {
        form.setC(form.getA() + form.getB());
        return form;
    }

}