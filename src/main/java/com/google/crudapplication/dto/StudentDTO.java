package com.google.crudapplication.dto;

import java.time.LocalDate;

public class StudentDTO {

    Integer id;
    Long groupId;
    String name;
    LocalDate localDate;


    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public StudentDTO(Integer id, Long groupId, String name, LocalDate localDate) {
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.localDate = localDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public StudentDTO() {
    }


}
