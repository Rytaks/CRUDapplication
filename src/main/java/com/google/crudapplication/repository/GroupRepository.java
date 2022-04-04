package com.google.crudapplication.repository;

import com.google.crudapplication.entity.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface GroupRepository extends CrudRepository <Group, Long> {

 List<Group> findAll();

}
