package fr.reivon.formation.spring.exo2.controller;

import fr.reivon.formation.spring.exo2.dto.AddVoitureForm;
import fr.reivon.formation.spring.exo2.model.Garage;
import fr.reivon.formation.spring.exo2.model.Parking;
import fr.reivon.formation.spring.exo2.model.Voiture;

public class ParkingController {

	private Garage garage;

	public String addEssence(String parkingName) {

		for (Parking parking : garage.getParkings()) {
			if (parking.getNom()
					   .equals(parkingName)) {
				parking.alimenterEssence();
				break;
			}
		}

		return "{\"status\":\"OK\"}";
	}

	public String addVoiture(AddVoitureForm addVoitureForm) {

		Voiture voiture = new Voiture();
		voiture.setNom(addVoitureForm.getVoitureName());
		voiture.setEssence(7);

		for (Parking parking : garage.getParkings()) {
			if (parking.getNom()
					   .equals(addVoitureForm.getParkingName())) {
				parking.getVoitures()
					   .add(voiture);
				break;
			}
		}

		// On souhaite retourner sur la page /
		return "";
	}
}
