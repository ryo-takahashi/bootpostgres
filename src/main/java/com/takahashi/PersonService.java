package com.takahashi;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

  @Autowired
  PersonRepository repository;
  
  public List<Person> findAll(){
    return repository.findAll(new Sort(Sort.Direction.ASC,"id"));
  }
  
  
}
