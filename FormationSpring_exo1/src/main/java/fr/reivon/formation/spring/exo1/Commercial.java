package fr.reivon.formation.spring.exo1;

public class Commercial {

    private String nom;

    private String age;

    // *************** GETTER / SETTER ***************

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return nom + "(" + age + ")";
    }
}
