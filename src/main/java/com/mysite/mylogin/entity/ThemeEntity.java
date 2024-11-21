package com.mysite.mylogin.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ThemeEntity {
    @Id
    private int theme_id;
    private int theme_price;
    private String theme_image;
}
