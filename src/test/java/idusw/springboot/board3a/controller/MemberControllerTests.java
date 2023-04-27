package idusw.springboot.board3a.controller;

import idusw.springboot.board3a.domain.Member;
import idusw.springboot.board3a.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MemberControllerTests { // Unit Test : JUnit - Test Framework
    @Autowired
    MemberService memberService;
    /*
    @Autowired
    MemberRepository memberRepository;
    */
    @Test
    void contextLoads() {
        List<Member> result = memberService.readList();
        for(Member m : result)
            System.out.println(m.getSeq() + ":" + m.getEmail() + ":" + m.getName());
    }
}