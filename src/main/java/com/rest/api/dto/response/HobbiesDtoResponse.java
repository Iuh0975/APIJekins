package com.rest.api.dto.response;

public class HobbiesDtoResponse {

    private int id;
    private String nameHobbies;

    public HobbiesDtoResponse() {

    }

    public HobbiesDtoResponse(int id, String nameHobbies) {

        this.id = id;
        this.nameHobbies = nameHobbies;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNameHobbies() {

        return nameHobbies;
    }

    public void setNameHobbies(String nameHobbies) {

        this.nameHobbies = nameHobbies;
    }

}
