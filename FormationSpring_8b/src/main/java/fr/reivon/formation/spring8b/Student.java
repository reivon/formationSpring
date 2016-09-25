package fr.reivon.formation.spring8b;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Student {
    private String age;
    private String name;
    private String id;

    private String sexe;
    private Boolean friteAddict;
    private String description;
    private String sauce;

    public Student() {
        this.name = "Nom";
        this.age = "12";
        this.id = "123";
        this.sexe = "F";
        this.friteAddict = Boolean.TRUE;
        this.description = "Entrez ici votre description";
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Boolean getFriteAddict() {
        return friteAddict;
    }

    public void setFriteAddict(Boolean friteAddict) {
        this.friteAddict = friteAddict;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
