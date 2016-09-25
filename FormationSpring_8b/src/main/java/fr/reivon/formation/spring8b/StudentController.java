package fr.reivon.formation.spring8b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student");
        mv.addObject("studentForm", new Student());

        Map<String, String> sauces = new HashMap<String, String>();
        sauces.put("MAY", "Mayonnaise");
        sauces.put("KET", "Ketchup");
        sauces.put("BAR", "Barbecue");

        mv.addObject("sauces", sauces);

        return mv;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("studentForm")Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        model.addAttribute("description", student.getDescription());
        model.addAttribute("friteAddict", student.getFriteAddict());
        model.addAttribute("sauce", student.getSauce());
        model.addAttribute("sexe", student.getSexe());

        return "result";
    }
}