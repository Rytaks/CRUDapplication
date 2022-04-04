package com.google.crudapplication.sevice;

import com.google.crudapplication.dto.StudentDTO;
import com.google.crudapplication.entity.Group;
import com.google.crudapplication.entity.Student;
import com.google.crudapplication.repository.GroupRepository;
import com.google.crudapplication.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    public StudentServiceImpl(StudentRepository studentRepository, GroupRepository groupRepository) {
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
    }

    @Override
    public void add(StudentDTO studentDTO) {

        Group group = groupRepository.findById(studentDTO.getGroupId())
                .orElseThrow(()-> new IllegalStateException("Группа с таким ID  не найдена"));


        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setCreateAt(LocalDate.now());
        student.setGroup(group);

        studentRepository.save(student);

    }
}
