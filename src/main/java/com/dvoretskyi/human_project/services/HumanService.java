package com.dvoretskyi.human_project.services;

import com.dvoretskyi.human_project.dto.HumanDto;
import com.dvoretskyi.human_project.entity.Human;
import java.util.List;

/**
 * The interface Human service.
 */
public interface HumanService {


  /**
   * Find by second name human.
   *
   * @param secondName the second name
   * @return the human
   */
  Human findBySecondName(String secondName);

  /**
   * Find by id human.
   * s
   *
   * @param id the id
   * @return the human
   */
  Human findById(long id);

  /**
   * Save human human.
   *
   * @param human the human
   * @return the human
   */
  Human saveHuman(Human human);


  /**
   * Delete human by id.
   *
   * @param id the id
   */
  void deleteHumanById(long id);

  /**
   * Find all.
   *
   * @param human the human
   */
  void findAll(Human human);

  /**
   * Find all humans list.
   *
   * @return the list
   */
  List<Human> findAllHumans();

  /**
   * Find all humans dto list.
   *
   * @return the list
   */
  List<HumanDto> findAllHumansDto();

}
