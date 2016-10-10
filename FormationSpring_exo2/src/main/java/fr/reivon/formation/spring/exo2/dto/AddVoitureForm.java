package fr.reivon.formation.spring.exo2.dto;

/**
 * Created by Tony MEMBOT on 10/10/2016.
 */
public class AddVoitureForm {
	private String voitureName;
	private String parkingName;

	public String getParkingName() {
		return parkingName;
	}

	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getVoitureName() {
		return voitureName;
	}

	public void setVoitureName(String voitureName) {
		this.voitureName = voitureName;
	}
}
