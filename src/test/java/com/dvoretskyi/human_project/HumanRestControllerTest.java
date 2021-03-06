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

//@TestPropertySource(locations = "classpath:application-integrationtest.properties")
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



/*  @Test
  public void testSearchASync() throws Exception {
    // Mocking service
    when(mangaService.getMangasByTitle(any(String.class))).thenReturn(mangas);
    MvcResult result = mockMvc.perform(get("/manga/async/ken").contentType(MediaType.APPLICATION_JSON))
        .andDo(print())
        .andExpect(request().asyncStarted())
        .andDo(print())
        // .andExpect(status().is2xxSuccessful()).andReturn();
        .andReturn();
    // result.getRequest().getAsyncContext().setTimeout(10000);
    mockMvc.perform(asyncDispatch(result))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].title", is("Hokuto no ken")));
  }*/


  /*@Test
  public void whenValidInput_thenCreateHuman() throws IOException, Exception {
    HumanDto humanThird = new HumanDto("Olet", "Walter", "Kyiv", "+383435544");
    mvc.perform(
        post("/humans/all").contentType(MediaType.APPLICATION_JSON)
            .content(JsonUtil.toJson(humanThird)));
*/
   /* List<Human>humans = repository.findAll();
    assertThat(humans).extracting(HumanDto::getSecondName).containsOnly("Walter");*/
  }
/*  @Test
  public void givenEmployees_whenGetEmployees_thenStatus200() throws Exception {
    createTestHuman("bob");
    createTestHuman("alex");

    // @formatter:off
    mvc.perform(get("/api/human").contentType(MediaType.APPLICATION_JSON))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(2))))
        .andExpect(jsonPath("$[0].name", is("bob")))
        .andExpect(jsonPath("$[1].name", is("alex")));
  }*/
  // @formatter:on

  //

/*  private void createTestHuman(long id, String firstName, String secondName, String city,
      String phoneNumber) {
    Human human = new Human(id,firstName,secondName,city,phoneNumber);
    repository.saveAndFlush(human);
  }*/
