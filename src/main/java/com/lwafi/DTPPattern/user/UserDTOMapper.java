package com.lwafi.DTPPattern.user;

import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component

public class UserDTOMapper implements Function<User,UserDTO> {
     @Override
    public UserDTO apply(User user) {

         return  new UserDTO(
                 user.getUserId(),
                 user.getFirstName(),
                 user.getLastName(),
                 user.getEmail()
         ) ;
     }


}
