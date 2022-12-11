package com.hanghae.jewel.domain.member.model;

public class MemberDto {
    private String name;
    private int height;

    public MemberDto() { //생성자
    }

    public MemberDto(String name, int height) { //객체 생성
        this.name=name;
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;

    }

    public void setName(String name) {
       this.name=name;

    }

    public void setHeight(int height) {
        this.height=height;
    }

    public Member toEntity(){ //사용자가 입력한 값을 이런 형식으로 받아온다 ~
        return new Member(
                null,
                this.name,
                this.height
        );
    }

    public static MemberDto fromEntity(Member member){ //받아올 때
      return new MemberDto(
              member.getName(),
              member.getHeight()
      );
    }
}
