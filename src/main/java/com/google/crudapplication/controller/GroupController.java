package com.google.crudapplication.controller;
import com.google.crudapplication.dto.ALLGroupResponseDTO;
import com.google.crudapplication.dto.GroupRequestDTO;
import com.google.crudapplication.dto.GroupResponseDTO;
import com.google.crudapplication.sevice.GroupService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/groups")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping
    public void add(@RequestBody GroupRequestDTO groupRequestDTO) {
        groupService.add(groupRequestDTO);
    }
 @GetMapping
    public List<ALLGroupResponseDTO> getALLGroups(){
        return groupService.getALLGroups();
 }

 @GetMapping(path = "/{id}")
    public GroupResponseDTO getGroup(@PathVariable Long id){
        return groupService.getGroup(id);
 }



}
