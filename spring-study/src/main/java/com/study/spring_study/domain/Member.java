package com.study.spring_study.domain;

/*
 * 1. 회원정보 도메인
 */
public class Member {

    private Long id;
    private String name;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
