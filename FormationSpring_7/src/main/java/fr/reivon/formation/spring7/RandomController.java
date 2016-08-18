package fr.reivon.formation.spring7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RandomController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("je suis dans index");
        return "index";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(HttpServletRequest request) {
        System.out.println("je suis dans redirect");
        request.setAttribute("name", "redirectName");
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/forward", method = RequestMethod.GET)
    public String forward(HttpServletRequest request) {
        System.out.println("je suis dans forward");
        request.setAttribute("name", "forwardName");
        return "forward:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(HttpServletRequest request) {
        System.out.println("je suis dans final");
        System.out.println("Le name est " + request.getAttribute("name"));
        return "final";
    }
}