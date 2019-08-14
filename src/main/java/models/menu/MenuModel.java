package models.menu;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;

@Entity
@Table(name = "menu", schema = "pogocafe", catalog = "")
public class MenuModel {
    @Id
    @Column(name = "id", nullable = false)
    @DatabaseField(generatedId = true)
    private int id;

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;

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
