package com.mysite.mylogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class ChallengeEntity {
    @Id
    @Column(name = "challenge_id")
    private int challengeId;

    private String title;
    private LocalDate start;
    private LocalDate finish;
    private String status;
    private String comment;
}
