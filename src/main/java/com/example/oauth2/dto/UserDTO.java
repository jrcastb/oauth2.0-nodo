package com.example.oauth2.dto;

import com.example.oauth2.model.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private String id;
    private String username;

    public static UserDTO from(User user){
        return builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }
}