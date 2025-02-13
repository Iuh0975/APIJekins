package com.rest.api.dto.response;

import java.util.List;

public class ProjectDtoResponse {

    private int projectId;
    private String nameProject;
    private int year;
    private List<MemberDtoResponse> memberList;

    public ProjectDtoResponse() {

    }

    public ProjectDtoResponse(int projectId, String nameProject, int year, List<MemberDtoResponse> memberList) {

        this.projectId = projectId;
        this.nameProject = nameProject;
        this.year = year;
        this.memberList = memberList;
    }

    public int getProjectId() {

        return projectId;
    }

    public void setProjectId(int projectId) {

        this.projectId = projectId;
    }

    public String getNameProject() {

        return nameProject;
    }

    public void setNameProject(String nameProject) {

        this.nameProject = nameProject;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public List<MemberDtoResponse> getMemberList() {

        return memberList;
    }

    public void setMemberList(List<MemberDtoResponse> memberList) {

        this.memberList = memberList;
    }

}
