package models.menu;

import java.io.Serializable;

public class ItemModel implements Serializable {
    private int id;

    private String name;

    private String ingredients;

    private double price;

    private String picture;

    private int idCategory;

    public ItemModel(){

    }

    public ItemModel(int id, String name, String ingredients, double price, String picture, int idCategory) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.picture = picture;
        this.idCategory = idCategory;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}