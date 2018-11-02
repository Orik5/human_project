package com.dvoretskyi.human_project;

import com.dvoretskyi.human_project.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/*@RunWith(SpringRunner.class)
@DataJpaTest*/
public class HumanRepositoryIntegrationTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private HumanRepository humanRepository;

 /* @Test
  public void whenInvalidId_thenReturnNull() {
    Human fromDb = humanRepository.findById((long) -111).orElse(null);
    assertThat(fromDb).isNull();
  }*/

/*  @Test
  public void whenInvalidName_thenReturnNull() {
    Human fromDb = humanRepository.findBySecondName("");
    assertThat(fromDb).isNull();
  }*/

/*
  @Test
  public void whenFindBySecondName_thenReturnHuman() {
    // given
    Human human = new Human(1, null, null, null, null);
    entityManager.persist(human);
    entityManager.flush();

    // when
    Human found = humanRepository.findBySecondName(human.getSecondName());

    // then
    assertThat(found.getSecondName())
        .isEqualTo(human.getSecondName());
  }
*/

 /* @Test
  public void whenFindById_thenReturnEmployee() {
    Human human = new Human(2, null, null, null, null);
    entityManager.persistAndFlush(human);

    Human fromDb = humanRepository.findById(human.getId()).orElse(null);
    assertThat(fromDb.getSecondName()).isEqualTo(human.getSecondName());
  }*/
  /*@Test
  public void givenSetOfEmployees_whenFindAll_thenReturnAllEmployees() {
    Human alex = new Human(1, null, null, "", "");
    Human ron = new Human(2, "", "ron", "", "");
    Human bob = new Human(3, "", "bob", "", "");

    entityManager.persist(alex);
    entityManager.persist(bob);
    entityManager.persist(ron);
    entityManager.flush();

    List<Human> allEmployees = humanRepository.findAll();

    assertThat(allEmployees).hasSize(3).extracting(Human::getSecondName)
        .containsOnly(alex.getSecondName(), ron.getSecondName(), bob.getSecondName());
  }*/
}
