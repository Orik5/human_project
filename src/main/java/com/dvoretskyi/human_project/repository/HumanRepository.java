package com.dvoretskyi.human_project.repository;

import com.dvoretskyi.human_project.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Human repository.
 */
@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {

  Human findBySecondName(String secondName);

}
