package models.menu;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "pogocafe", catalog = "")
public class CategoryModel {
    @Id
    @Column(name = "id", nullable = false)
    @DatabaseField(generatedId = true)
    private int id;

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Column(name = "menuName", nullable = false)
    private String MenuName;

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
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
