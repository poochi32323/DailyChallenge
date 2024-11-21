package com.mysite.mylogin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private String id;

    private String username;
    private String password;
    private String mobile;
    private String email;
}
