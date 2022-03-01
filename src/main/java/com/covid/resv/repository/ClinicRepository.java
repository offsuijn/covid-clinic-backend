package com.covid.resv.repository;

import com.covid.resv.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Member, Long> {
}
