package com.mysite.mylogin.controller;

import com.mysite.mylogin.dto.JoinRequest;
import com.mysite.mylogin.dto.JoinResponse;
import com.mysite.mylogin.dto.LoginRequest;
import com.mysite.mylogin.dto.LoginResponse;
import com.mysite.mylogin.service.JoinService;
import com.mysite.mylogin.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public ResponseEntity<LoginResponse> loginProcess(@RequestBody LoginRequest request) {
        LoginResponse response = loginService.loginProcess(request);
        return ResponseEntity.ok().body(response);
    }
}
