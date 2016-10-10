package fr.reivon.formation.spring.exo2full.model;

import java.util.List;

public class Garage {

	List<Parking> parkings;

	Commercial commercial;

	// *************** GETTER / SETTER ***************

	public List<Parking> getParkings() {
		return parkings;
	}

	public void setParkings(List<Parking> parkings) {
		this.parkings = parkings;
	}

	public Commercial getCommercial() {
		return commercial;
	}

	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}

}
