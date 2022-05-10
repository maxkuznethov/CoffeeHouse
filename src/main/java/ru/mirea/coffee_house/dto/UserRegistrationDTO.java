package ru.mirea.coffee_house.dto;

import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String number;
    private String password;
}
