package com.rest.api.dto.request;

import java.util.List;


public class ProjectDtoRequest {

    private int id;
    private String name;
    private int year;
    private List<MemberDtoRequest> memberList;

    public ProjectDtoRequest() {

    }

    public ProjectDtoRequest(int id, String name, int year, List<MemberDtoRequest> memberList) {

        this.id = id;
        this.name = name;
        this.year = year;
        this.memberList = memberList;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public List<MemberDtoRequest> getMemberList() {

        return memberList;
    }

    public void setMemberList(List<MemberDtoRequest> memberList) {

        this.memberList = memberList;
    }

}
