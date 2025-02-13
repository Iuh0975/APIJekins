package com.rest.api.dto.request;

import java.util.List;

public class UserDtoRequest {

    private int id;
    private int age;
    private String name;
    private List<HobbiesDtoRequest> hobbiesDtoList;
    private List<ProjectDtoRequest> projectDtoList;

    public UserDtoRequest() {

    }

    public UserDtoRequest(int id, int age, String name, List<HobbiesDtoRequest> hobbiesDtoList, List<ProjectDtoRequest> projectDtoList) {

        this.id = id;
        this.age = age;
        this.name = name;
        this.hobbiesDtoList = hobbiesDtoList;
        this.projectDtoList = projectDtoList;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<HobbiesDtoRequest> getHobbiesDtoList() {

        return hobbiesDtoList;
    }

    public void setHobbiesDtoList(List<HobbiesDtoRequest> hobbiesDtoList) {

        this.hobbiesDtoList = hobbiesDtoList;
    }

    public List<ProjectDtoRequest> getProjectDtoList() {

        return projectDtoList;
    }

    public void setProjectDtoList(List<ProjectDtoRequest> projectDtoList) {

        this.projectDtoList = projectDtoList;
    }

}
