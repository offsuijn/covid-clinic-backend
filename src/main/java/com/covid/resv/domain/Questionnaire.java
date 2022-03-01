package com.covid.resv.domain;

import javax.persistence.*;

@Entity
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionnaire_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(length = 225, nullable = false)
    private String address;

    @Column(length = 45, nullable = false)
    private String reason;

    @Column(length = 45, nullable = false)
    private String symptom;
}
