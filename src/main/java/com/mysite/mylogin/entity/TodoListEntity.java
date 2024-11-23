package com.mysite.mylogin.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class TodoListEntity {
    @Id
    @Column(name = "todo_list_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoListId;

    @Column(nullable = false)
    private String Title;

    private LocalDateTime Due_date;
    private String notes;

    @Column(nullable = false)
    private String Repeat_type;

    @Column(nullable = false)
    private String Favorite;

    @Column(nullable = false)
    private String alarm;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity userid;
}
