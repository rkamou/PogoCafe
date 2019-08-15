package models.menu;

public class CategoryModel {
    private int id;

    private String name;

    private String description;

    private String menuName;

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
