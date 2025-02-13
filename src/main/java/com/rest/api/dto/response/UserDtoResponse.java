package com.rest.api.dto.response;

import java.util.List;

public class UserDtoResponse {

    private int numberIdentify;
    private String userName;
    private int yearBorn;
    private List<HobbiesDtoResponse> hobbiesDtoList;
    private List<ProjectDtoResponse> projectDtoList;

    public UserDtoResponse() {

    }

    public UserDtoResponse(int numberIdentify, String userName, int yearBorn, List<HobbiesDtoResponse> hobbiesDtoList, List<ProjectDtoResponse> projectDtoList) {

        this.numberIdentify = numberIdentify;
        this.userName = userName;
        this.yearBorn = yearBorn;
        this.hobbiesDtoList = hobbiesDtoList;
        this.projectDtoList = projectDtoList;
    }

    public int getNumberIdentify() {

        return numberIdentify;
    }

    public void setNumberIdentify(int numberIdentify) {

        this.numberIdentify = numberIdentify;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public int getYearBorn() {

        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {

        this.yearBorn = yearBorn;
    }

    public List<HobbiesDtoResponse> getHobbiesDtoList() {

        return hobbiesDtoList;
    }

    public void setHobbiesDtoList(List<HobbiesDtoResponse> hobbiesDtoList) {

        this.hobbiesDtoList = hobbiesDtoList;
    }

    public List<ProjectDtoResponse> getProjectDtoList() {

        return projectDtoList;
    }

    public void setProjectDtoList(List<ProjectDtoResponse> projectDtoList) {

        this.projectDtoList = projectDtoList;
    }

}
