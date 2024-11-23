package com.mysite.mylogin.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ThemeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long theme_id;

    @Column(nullable = false)
    private int theme_price;

    @Column(nullable = false)
    private String theme_image;
}
