package classes;

import java.util.ArrayList;

public class Result {
    private boolean success;
    private ArrayList<String> errors;
    private int id;

    public Result(){
        success = true;
        errors = new ArrayList<>();
    }

    public Result(String error){
        success = false;
        errors = new ArrayList<>();
        addError(error);
    }

    public Result(Exception exception){
        success = false;
        errors = new ArrayList<>();
        addError(exception);
    }

    public void addError(String error){
        success = false;
        errors.add(error);
    }

    public void addError(Exception exception){
        addError(exception.getMessage());
    }

    public boolean isSuccess() {
        return success;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
