package com.google.crudapplication.sevice;

import com.google.crudapplication.dto.ALLGroupResponseDTO;
import com.google.crudapplication.dto.GroupRequestDTO;
import com.google.crudapplication.dto.GroupResponseDTO;
import com.google.crudapplication.dto.StudentDTO;
import com.google.crudapplication.entity.Group;
import com.google.crudapplication.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;


    @Override
    public void add(GroupRequestDTO groupRequestDTO) {

        Group group = new Group();
        group.setName(groupRequestDTO.getName());
        group.setCreateAt(LocalDate.now());


        groupRepository.save(group);

    }

    @Override
    public List<ALLGroupResponseDTO> getALLGroups() {
        List<Group> all = groupRepository.findAll();
        return all.stream()
                .map(group -> {
                    ALLGroupResponseDTO allGroupResponseDTO = new ALLGroupResponseDTO();
                    allGroupResponseDTO.setId(group.getId());
                    allGroupResponseDTO.setName(group.getName());
                    allGroupResponseDTO.setStudentQuantity(group.getStudents().size());
                    return allGroupResponseDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public GroupResponseDTO getGroup(Long id) {
        Group group = groupRepository.findById(id).get();
        GroupResponseDTO groupResponseDTO = new GroupResponseDTO();
        groupResponseDTO.setId(group.getId());
        groupResponseDTO.setName(group.getName());
        groupResponseDTO.setStudents(group.getStudents().stream()
                .map(student ->{
                    StudentDTO studentDTO = new StudentDTO();
                    studentDTO.setId(student.getId());
                    studentDTO.setName(student.getName());
                    return studentDTO;
                }).collect(Collectors.toList()));
        return groupResponseDTO;
    }
}
