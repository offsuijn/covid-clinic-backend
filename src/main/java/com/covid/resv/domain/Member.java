package com.covid.resv.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(length = 225, nullable = false)
    private String email;

    @Column(length = 225, nullable = false)
    private String password;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 45, nullable = false)
    private String phone;

//    @Column
    /// 주민번호, 성별 추가


    @OneToMany(mappedBy = "member")
    private List<Resv> resvs = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Wait> waits = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Questionnaire> questionnaires = new ArrayList<>();
}
