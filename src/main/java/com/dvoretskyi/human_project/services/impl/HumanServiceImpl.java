package com.dvoretskyi.human_project.services.impl;

import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.repository.HumanRepository;
import com.dvoretskyi.human_project.services.HumanService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Human service.
 */
@Service
public class HumanServiceImpl implements HumanService {

  @Autowired
  private HumanRepository humanRepository;

  private List<Human> humanList = new ArrayList<>();

  @Override
  public Human findBySecondName(String secondName) {
    return humanRepository.findBySecondName(secondName);
  }

  @Override
  public Human findById(long id) {
    return humanRepository.findById(id).get();
  }

  @Override
  public Human saveHuman(Human human) {
    return humanRepository.save(human);
  }
/*
  @Override
  public Human updateHuman(long id, Human human) {
       return humanRepository.save(human);
  }*/

  @Override
  public void deleteHumanById(long id) {
    humanRepository.deleteById(id);
  }

  @Override
  public void findAll(Human human) {
    humanRepository.findAll();
  }


  @Override
  public List<Human> findAllHumans() {
    return humanRepository.findAll();
  }
}
