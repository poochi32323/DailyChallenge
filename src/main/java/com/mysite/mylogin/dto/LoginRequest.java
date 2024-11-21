package com.mysite.mylogin.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@Data
public class LoginRequest {

    @NotBlank(message = "아이디를 입력해주세요")
    private String userid;

    @NotBlank(message = "비밀번호를 입력해주세요")
    private String password;

    // Getters and Setters



}
