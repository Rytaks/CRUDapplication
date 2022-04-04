package com.google.crudapplication.dto;

import java.util.Objects;

public class ALLGroupResponseDTO {

    Long id;
    String name;
    int studentQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    @Override
    public String toString() {
        return "ALLGroupResponseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentQuantity=" + studentQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ALLGroupResponseDTO that = (ALLGroupResponseDTO) o;
        return studentQuantity == that.studentQuantity && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentQuantity);
    }
}
