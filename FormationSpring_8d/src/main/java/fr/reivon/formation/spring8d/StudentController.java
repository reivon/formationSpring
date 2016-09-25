package fr.reivon.formation.spring8d;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student");
        mv.addObject("studentForm", new Student());
        return mv;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("studentForm") Student student, ModelMap model, @RequestParam("photo") MultipartFile file) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                // Creating directory
                File dir = new File("c:" + File.separator + "tmpFiles");
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Create file
                File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getName() + "Saved." + FilenameUtils.getExtension(file.getOriginalFilename()));
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                System.out.println("Server File Location = " + serverFile.getAbsolutePath());
                model.addAttribute("photo", serverFile.getAbsolutePath());
            } catch (Exception e) {
            }
        }

        return "result";
    }
}