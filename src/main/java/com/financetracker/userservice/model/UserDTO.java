package com.financetracker.userservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserDTO {
    private String username;
    private String email;
    private String password;

}
