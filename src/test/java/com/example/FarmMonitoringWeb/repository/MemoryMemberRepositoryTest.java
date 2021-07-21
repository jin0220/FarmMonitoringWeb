package com.example.FarmMonitoringWeb.repository;

import com.example.FarmMonitoringWeb.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setId("asd");
        member.setName("홍길동");
        member.setPassword("1234");
        member.setFarm_id("1");
        member.setEmail("email@email.com");
        member.setPhone("01000000000");
        member.setPlant1("잎체소");
        member.setPlant2("국화과");
        member.setPlant3("상추");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);
    }
}
