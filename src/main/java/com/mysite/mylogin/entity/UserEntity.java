package com.mysite.mylogin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private String userid;

    private String password;
    private String mobile;
    private String email;
}
