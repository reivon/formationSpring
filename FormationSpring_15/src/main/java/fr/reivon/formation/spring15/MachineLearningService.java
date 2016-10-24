package fr.reivon.formation.spring15;


public class MachineLearningService implements DataModelService {

    private String message;

    @Override
    public boolean isValid(String input) {
        System.out.println(message);
        return true;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}