package com.example.spring_test;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {
    private final MemberMapper memberMapper;
    private final MemberService memberService;


    @GetMapping("/")
    public String test() {
//        List<Member> all = memberMapper.findAll();
//        System.out.println(all.get(0));
        List<Member> all1 = memberService.findAll();
        System.out.println(all1.get(0));
        return "test";
    }
}
