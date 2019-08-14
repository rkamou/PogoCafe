package models.menu;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;

@Entity
@Table(name = "item", schema = "pogocafe", catalog = "")
public class ItemModel {
    @Id
    @Column(name = "id", nullable = false)
    @DatabaseField(generatedId = true)
    private int id;

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;

    @Basic
    @Column(name = "ingredients", nullable = true, length = 255)
    private String ingredients;

    @Basic
    @Column(name = "price", nullable = false)
    private double price;

    @Basic
    @Column(name = "picture", nullable = true, length = 255)
    private String picture;

    @Basic
    @Column(name = "idCategory", nullable = false)
    private int idCategory;

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