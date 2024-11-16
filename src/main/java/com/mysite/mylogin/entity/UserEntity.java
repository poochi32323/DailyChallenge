package com.mysite.mylogin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    회원 중복 처리
    @Column(unique = true)
    private String username;

    private String password;

    private int mobile;

    @Column(unique = true)
    private String email;

    private String role;
}
