package com.dvoretskyi.human_project.services.impl;

import com.dvoretskyi.human_project.dto.HumanDto;
import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.repository.HumanRepository;
import com.dvoretskyi.human_project.services.HumanService;
import java.util.ArrayList;
import java.util.List;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Human service.
 */
@Service
public class HumanServiceImpl implements HumanService {

  @Autowired
  private HumanRepository humanRepository;
  @InjectMocks
  private HumanRepository humanRepositoryTest;


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

    //return new ArrayList<>(humanList)/*humanRepository.findAll()*/;
  }

  @Override
  public List<HumanDto> findAllHumansDto() {
    List<HumanDto> humanDtos = new ArrayList<>();
    List<Human> humans = humanRepository.findAll();
    for (Human human : humans) {
      humanDtos.add(HumanDto.convertToDto(human));
    }
    return humanDtos;

  }
}
