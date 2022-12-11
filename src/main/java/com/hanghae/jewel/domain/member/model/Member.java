package com.hanghae.jewel.domain.member.model;


import javax.persistence.*;

@Entity
public class Member {


    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "HEIGHT")
    private int height;


    public Member() { //생성자 선언
    }

    public Member(Long id, String name, int height) { //Member객체 생성
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public Long getId() { //아이디 값을 받아오면 리턴 아이디
        return id;
    }

    public String getName() { //이름을 받아오면 리턴 이름
        return name;
    }

    public int getHeight() { //키를 받아오면 리턴 키
        return height;
    }

    public void changeName(String name){ //이름 수정할 때
        this.name = name;
    }

    public void changeHeight(int height){ //키 수정
        this.height = height;
    }
}
