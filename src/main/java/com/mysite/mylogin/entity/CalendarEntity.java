package com.mysite.mylogin.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CalendarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false, length = 255)
    private String DdayName;

    @Column(length = 255)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
//    @Column(nullable = false, length = 20)
    private UserEntity userid;
}
