package com.models.users;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;
    private String surname;
    private String name;
    private String patronymic;
    private String post;


    public User() {
    }

    public User(String lastName, String firstName, String patronymic, String post) {
        this.surname = lastName;
        this.name = firstName;
        this.patronymic = patronymic;
        this.post = post;
    }


}