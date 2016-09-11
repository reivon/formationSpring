package fr.reivon.formation.spring.exo1;

import java.util.List;

public class Garage {

    List<Parking> parkings;

    Commercial commercial;

    public void execute() {
        System.out.println("GARAGE INITIAL");
        this.listerParking();

        System.out.println("== On alimente en essence les voitures");
        for (Parking parking : parkings) {
            parking.alimenterEssence();
        }

        Voiture voiture = parkings.get(0).getVoitures().get(1);
        System.out.println("== On vend une voiture (" + voiture.getNom() + "," + voiture.getEssence() + ") sur le parking " + parkings.get(0).getNom());
        parkings.get(0).vendreVoiture(voiture.getNom(), voiture.getEssence());

        System.out.println("GARAGE FIN");
        this.listerParking();
    }

    private void listerParking() {
        System.out.println("== Le garage de " + commercial + " contient:");
        for (Parking parking : parkings) {
            parking.listerVoitures();
        }
    }

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
