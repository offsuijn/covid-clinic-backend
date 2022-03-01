package com.covid.resv.domain;

import javax.persistence.*;

@Entity
public class Resv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resv_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clinic_id")
    private Clinic clinic;
}
