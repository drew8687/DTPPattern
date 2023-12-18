package com.lwafi.DTPPattern.user;

public record UserDTO(
        Long userId,
        String firstName,
        String lastName,
        String email
) {
}