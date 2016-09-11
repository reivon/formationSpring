package fr.reivon.formation.spring.exo1;

public class Voiture {
    private String nom;

    private int essence;

    // *************** GETTER / SETTER ***************

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    @Override
    public String toString() {
        return "     " + nom + " - niveau essence = " + essence;
    }
}
