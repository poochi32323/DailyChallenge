package com.mysite.mylogin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LoginResponse {

    private final String message;

    public LoginResponse(String message) {
        this.message = message;
    }
}
