package com.project.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    private long id;

    private long postId;

    private long userId;

    @Lob
    @Column(columnDefinition = "text")
    private String text;
}
