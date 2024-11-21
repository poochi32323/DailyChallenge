package com.mysite.mylogin.controller;

import com.mysite.mylogin.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final JoinService joinService;

//    @GetMapping("/login")
//    public ResponseEntity<String> login() {
//
//        return ResponseEntity.ok().body()
//    }
}
