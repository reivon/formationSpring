package fr.reivon.formation.spring.exo2;

import java.util.List;
import java.util.Random;

public class Parking {

	private String nom;

	private List<Voiture> voitures;

	public void initEssence() {
		Random rand = new Random();
		for (Voiture voiture : voitures) {
			voiture.setEssence(rand.nextInt(11));
		}
	}

	public void listerVoitures() {
		System.out.println("  ** Parking " + nom);
		for (Voiture voiture : voitures) {
			System.out.println(voiture);
		}
	}

	public void alimenterEssence() {
		for (Voiture voiture : voitures) {
			voiture.setEssence(voiture.getEssence() + 10);
		}
	}

	public void vendreVoiture(String nom, int essence) {
		for (Voiture voiture : voitures) {
			if (voiture.getNom()
					   .equals(nom) && voiture.getEssence() == essence) {
				voitures.remove(voiture);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return nom;
	}

	// *************** GETTER / SETTER ***************

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

}
