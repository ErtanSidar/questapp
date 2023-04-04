package com.project.questapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "likes")
@Data
public class Like {

    @Id
    private long id;

    private long postId;

    private long userId;
}
