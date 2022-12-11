package com.hanghae.jewel.domain.member;

import com.hanghae.jewel.domain.member.model.Member;
import com.hanghae.jewel.domain.member.model.MemberDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //1. Create
    public void signUp(MemberDto dto) {
        memberRepository.save(dto.toEntity());
    }

    //2. Read
    public MemberDto get(Long memberId) {
        Optional<Member>byId = memberRepository.findById(memberId);

        if(byId.isPresent()){
            Member member = byId.get();
            MemberDto memberDto = MemberDto.fromEntity(member);
            return memberDto;
        }else{
            return null;
        }
    }

    @Transactional
    public void update(Long memberId, MemberDto dto) {
        Optional<Member>byId=memberRepository.findById(memberId);

        if(byId.isPresent()){
            Member member = byId.get();

            member.changeName(dto.getName());
            member.changeHeight(dto.getHeight());
        }
    }

    // 4. Delete
    public void delete(Long memberId){

        memberRepository.deleteById(memberId);


    }
}
