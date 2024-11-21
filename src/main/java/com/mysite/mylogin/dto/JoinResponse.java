package com.mysite.mylogin.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class JoinResponse {

    private final String message;

    public JoinResponse(String message) {
        this.message = message;
    }
}


