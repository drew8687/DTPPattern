package com.lwafi.DTPPattern.user;   //https://javawhizz.com/2023/03/how-to-use-the-dto-pattern-in-spring-boot

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
