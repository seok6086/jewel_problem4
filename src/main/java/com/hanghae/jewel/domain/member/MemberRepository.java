package com.hanghae.jewel.domain.member;

import com.hanghae.jewel.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
