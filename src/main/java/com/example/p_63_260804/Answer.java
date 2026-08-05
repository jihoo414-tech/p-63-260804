package com.example.p_63_260804;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne // 앞에 오는게 현재 바라보고있는 클래스 -> Answer가 Many임
    private Question question;
}
