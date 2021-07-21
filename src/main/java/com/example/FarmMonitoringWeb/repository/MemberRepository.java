package com.example.FarmMonitoringWeb.repository;

import com.example.FarmMonitoringWeb.domain.Member;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
