package com.example.p_63_260804;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200) // varchar(200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;


    // cascade = CascadeType.REMOVE를 적으면 question을 remove하면 answer도 자동으로 remove됨
    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)// mappedBy가 붙은 쪽은 외래키를 만들지 않고 반대쪽에 만든다.
    private List<Answer> answers = new ArrayList<>();

}
