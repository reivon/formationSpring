package fr.reivon.formation.spring.exo2full.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.reivon.formation.spring.exo2full.dto.AddVoitureForm;
import fr.reivon.formation.spring.exo2full.model.Garage;

@Controller
public class GarageController {

	@Autowired
	private Garage garage;

	// 1. Appel de la page index
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView addEssence() {

		// 7. liste des voitures
		List<String> lstVoitureName = new ArrayList<String>();
		lstVoitureName.add("Polo");
		lstVoitureName.add("Clio");
		lstVoitureName.add("Zoé");
		lstVoitureName.add("106");
		lstVoitureName.add("206");

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listVoitures", lstVoitureName);
		mv.addObject("garage", garage);
		mv.addObject("addVoitureForm", new AddVoitureForm());

		return mv;
	}

}
