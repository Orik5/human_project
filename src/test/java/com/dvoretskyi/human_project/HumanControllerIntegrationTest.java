package com.dvoretskyi.human_project;

import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/*@RunWith(SpringRunner.class)
@WebMvcTest(HumanController.class)*/
public class HumanControllerIntegrationTest {

  @Autowired
  private MockMvc mvc;

  @MockBean
  private HumanServiceImpl service;

  @Test
  public void givenHuman_whenGetHumans_thenStatus200()
      throws Exception {
/*

    createTestHuman("bob");

    mvc.perform(get("/api/human")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content()
            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$[0].name", is("bob")));
  }

  @Test
  public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
      throws Exception {
    Human human = new Human(3, "Boromyr", "Hortyuk", "Chernihiv", "+38986768478");

    List<Human> allHumans = Arrays.asList(human);

    given(service.findAllHumans()).willReturn(allHumans);

    mvc.perform(get("/api/human")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect((ResultMatcher) MockRestRequestMatchers.jsonPath("$", hasSize(1)))
        .andExpect(
            (ResultMatcher) MockRestRequestMatchers
                .jsonPath("$[0].name", is(human.getSecondName())));
  }
*/


}}
