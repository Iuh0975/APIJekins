package com.rest.api.entity;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private int id;
    private int age;
    private String name;

}
