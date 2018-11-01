package com.dvoretskyi.human_project;


import com.dvoretskyi.human_project.repository.HumanRepository;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = HumanProjectApplication.class)
@AutoConfigureMockMvc
// @TestPropertySource(locations = "classpath:application-integrationtest.properties")
@AutoConfigureTestDatabase
public class HumanRestControllerTest {

  @Autowired
  private MockMvc mvc;

  @Autowired
  private HumanRepository repository;

  @After
  public void resetDb() {
    repository.deleteAll();
  }

  /*@Test
  public void whenValidInput_thenCreateHuman() throws IOException, Exception {
    Human bob = new Human(1, null, null, null, null);
    mvc.perform(
        post("/api/human").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(bob)));

    List<Human> found = repository.findAll();
    assertThat(found).extracting(Human::getSecondName).containsOnly(null);
  }
*/
  /*@Test
  public void givenEmployees_whenGetEmployees_thenStatus200() throws Exception {
    createTestEmployee("bob");
    createTestEmployee("alex");

    // @formatter:off
    mvc.perform(get("/api/employees").contentType(MediaType.APPLICATION_JSON))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(2))))
        .andExpect(jsonPath("$[0].name", is("bob")))
        .andExpect(jsonPath("$[1].name", is("alex")));}*/
  // @formatter:on

  //

/*  private void createTestEmployee(String secondName) {
    Human human = new Human(secondName);
    repository.saveAndFlush(human);
  }*/
}
