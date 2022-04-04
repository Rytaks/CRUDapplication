package com.google.crudapplication.dto;

public class GroupRequestDTO {

    String name;

    public GroupRequestDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

