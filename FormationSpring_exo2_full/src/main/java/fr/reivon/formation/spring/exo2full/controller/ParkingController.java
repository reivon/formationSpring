package fr.reivon.formation.spring.exo2full.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.reivon.formation.spring.exo2full.dto.AddVoitureForm;
import fr.reivon.formation.spring.exo2full.model.Garage;
import fr.reivon.formation.spring.exo2full.model.Parking;
import fr.reivon.formation.spring.exo2full.model.Voiture;

@Controller
@RequestMapping(value = "parking")
public class ParkingController {

	@Autowired
	private Garage garage;

	@ResponseBody
	@RequestMapping(value = "addEssenceAjax", method = RequestMethod.POST)
	public String addEssence(@RequestParam String parkingName, HttpServletRequest request) {

		for (Parking parking : garage.getParkings()) {
			if (parking.getNom()
					   .equals(parkingName)) {
				parking.alimenterEssence();
				break;
			}
		}

		return "{\"status\":\"OK\"}";
	}

	@RequestMapping(value = "addVoiture", method = RequestMethod.POST)
	public String addVoiture(@ModelAttribute AddVoitureForm addVoitureForm, HttpServletRequest request) {

		Voiture voiture = new Voiture();
		voiture.setNom(addVoitureForm.getVoitureName());
		voiture.setEssence(5);

		for (Parking parking : garage.getParkings()) {
			if (parking.getNom()
					   .equals(addVoitureForm.getParkingName())) {
				parking.getVoitures()
					   .add(voiture);
				break;
			}
		}

		return "redirect:/";
	}
}
