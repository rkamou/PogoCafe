package models.users;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;

@Entity
@Table(name = "user")

public class UserModel {
    @Id
    @Column(name = "id", nullable = false)
    @DatabaseField(generatedId = true)
    private Integer id;
    @Basic
    @Column(name = "first_name", nullable = true, length = 255)
    private String firstName;
    @Column(name = "last_name", nullable = true, length = 255)
    private String lastName;
    @Column(name = "login", nullable = false, length = 255)
    private String userName;
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Column(name = "role_user", nullable = false, length = 255)
    private String role;

    public UserModel(){}

    public UserModel(Integer id, String firstName, String lastName, String userName, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

}
