package models.menu;

import java.io.Serializable;

public class CategoryModel implements Serializable {
    private int id;

    private String name;

    private String description;

    private String menuName;

    public CategoryModel(){

    }

    public CategoryModel(int id, String name, String description, String menuName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.menuName = menuName;
    }

    public String getMenuName() { return menuName; }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
