package fr.reivon.formation.spring10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentValidator studentValidator;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "studentForm", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("studentForm") @Validated Student student, BindingResult result, ModelMap model) {

        // Appel manuel
        // studentValidator.validate(student, result);

        if (result.hasErrors()) {
            return "student";
        } else {
            model.addAttribute("name", student.getName());
            model.addAttribute("age", student.getAge());
            model.addAttribute("email", student.getEmail());
            model.addAttribute("id", student.getId());
            return "result";
        }
    }

    /**
     * Associer les validators au controller local.
     * @param binder
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(studentValidator);
    }
}