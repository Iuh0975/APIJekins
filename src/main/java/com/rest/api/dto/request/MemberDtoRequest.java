package com.rest.api.dto.request;

public class MemberDtoRequest {

    private int id;
    private String role;
    private String rank;

    public MemberDtoRequest() {

    }

    public MemberDtoRequest(int id, String role, String rank) {

        this.id = id;
        this.role = role;
        this.rank = rank;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getRole() {

        return role;
    }

    public void setRole(String role) {

        this.role = role;
    }

    public String getRank() {

        return rank;
    }

    public void setRank(String rank) {

        this.rank = rank;
    }

}
