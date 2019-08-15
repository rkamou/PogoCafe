package models.users;

import java.io.Serializable;

public class UserModel implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
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
