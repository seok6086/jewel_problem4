package com.hanghae.jewel.web;

import com.hanghae.jewel.domain.member.MemberService;
import com.hanghae.jewel.domain.member.model.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService=memberService;
    }

    @PostMapping("/member")
    public void create(@RequestBody MemberDto memberDto){
       memberService.signUp(memberDto);
    }

    @GetMapping("/member")
    public MemberDto get(@RequestParam(name = "memberId") Long memberId) {
        return memberService.get(memberId);
    }

    @PutMapping("/member")
    public void update(@RequestParam(name = "memberId") Long memberId, @RequestBody MemberDto memberDto) {
        memberService.update(memberId,memberDto);
    }

    @DeleteMapping("/member")
    public void delete(@RequestParam(name = "memberId") Long memberId) {
        memberService.delete(memberId);
    }

}
