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
    private int todoListId;

    private String Title;
    private LocalDateTime Due_date;
    private String notes;
    private String Repeat_type;
    private String Favorite;
    private String alarm;
//
//    @ManyToOne
//    @JoinColumn
//    private UserEntity user;
}
