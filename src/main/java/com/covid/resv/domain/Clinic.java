package com.covid.resv.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinic_id")
    private Long id;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 225, nullable = false)
    private String address;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(length = 45, nullable = false)
    private String waiting_num;

    @Column(length = 45, nullable = false)
    private String now_num;

    @OneToMany(mappedBy = "clinic")
    private List<Resv> resvs = new ArrayList<>();

    @OneToMany(mappedBy = "clinic")
    private List<Wait> waits = new ArrayList<>();
}
