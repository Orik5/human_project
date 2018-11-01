package com.dvoretskyi.human_project.services;

import com.dvoretskyi.human_project.entity.Human;
import java.util.List;

/**
 * The interface Human service.
 */
public interface HumanService {

  Human findBySecondname(String secondName);

  /**
   * Find by id human.
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

  void findAll(Human human);

  /**
   * Find all humans list.
   *
   * @return the list
   */
  List<Human> findAllHumans();

}
