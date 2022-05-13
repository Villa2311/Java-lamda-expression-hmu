package com.java.lamda.function.streammap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Abdul", "secret", "abdul@gmail.com"));
        users.add(new User(2, "Abdul", "secret", "abdul1@gmail.com"));
        users.add(new User(3, "Abdul", "secret", "abdul2@gmail.com"));
        users.add(new User(4, "Abdul", "secret", "abdul3@gmail.com"));

        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
//        UserDTO dto = null;
        for (User user: users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for (UserDTO dto: usersDTO){
            System.out.println(dto);
        }
        System.out.println();

        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        });

        users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach(userDTO -> {
                    System.out.println(userDTO);
                });

        System.out.println();

        users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
        usersDTO.forEach(System.out::println);


    }
}

class UserDTO{
    public UserDTO(int id, String userName,  String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    private String userName;
    private String email;
    private int id;
}
class User{

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    private String userName;
    private String password;
    private String email;
    private int id;

}
