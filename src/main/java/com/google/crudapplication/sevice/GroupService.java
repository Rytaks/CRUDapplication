package com.google.crudapplication.sevice;


import com.google.crudapplication.dto.ALLGroupResponseDTO;
import com.google.crudapplication.dto.GroupRequestDTO;
import com.google.crudapplication.dto.GroupResponseDTO;

import java.util.List;


public interface GroupService {

    void add (GroupRequestDTO groupRequestDTO);


    List<ALLGroupResponseDTO> getALLGroups();

    GroupResponseDTO getGroup(Long id);
}
