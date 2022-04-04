package com.google.crudapplication.dto;

import java.util.List;
import java.util.Objects;

public class GroupResponseDTO {

    Long id;
    String name;
    int studentQuantity;
    List<StudentDTO> students;

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

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
        GroupResponseDTO that = (GroupResponseDTO) o;
        return studentQuantity == that.studentQuantity && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentQuantity);
    }
}
