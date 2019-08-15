package models.users;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private UserType role;

    public UserModel(String id, String firstName, String lastName, String userName, String password, UserType role) {
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

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public UserType getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
