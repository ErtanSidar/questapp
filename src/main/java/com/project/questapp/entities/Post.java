package com.project.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "post")
@Data
public class Post {

    @Id
    private long id;

    private long userId;

    private String title;

    @Lob
    @Column(columnDefinition = "text")
    private String text;
}