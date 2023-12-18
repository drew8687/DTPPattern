package com.lwafi.DTPPattern.user;

import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class UserRepository {
    public List<User> findAllUsers(){
        return List.of(
                new User(1L,"driss","lwfi",
                        "driss@htmail.com","passw123"),
                new User(2L,"med","amine",
                        "medamine@gmail.com","password1234"),
                new User(3L,"ed","ed",
                        "ed@gmail.com","password4321"),
                new User(4L,"elon","musk",
                        "elon@mask.com","password356")
        );
    }


}
