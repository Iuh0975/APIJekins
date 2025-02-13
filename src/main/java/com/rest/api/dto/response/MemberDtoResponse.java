package com.rest.api.dto.response;

public class MemberDtoResponse {

    private int memberId;
    private String title;
    private String level;

    public MemberDtoResponse() {

    }

    public MemberDtoResponse(int memberId, String title, String level) {

        this.memberId = memberId;
        this.title = title;
        this.level = level;
    }

    public int getMemberId() {

        return memberId;
    }

    public void setMemberId(int memberId) {

        this.memberId = memberId;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getLevel() {

        return level;
    }

    public void setLevel(String level) {

        this.level = level;
    }

}
