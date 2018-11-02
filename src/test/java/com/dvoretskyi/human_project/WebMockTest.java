package com.dvoretskyi.human_project;

import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/*@RunWith(SpringRunner.class)
@WebMvcTest(HumanController.class)*/
public class WebMockTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private HumanServiceImpl service;

/*  @Test
  public void greetingShouldReturnMessageFromService() throws Exception {
    when(service.findBySecondName(null));
    this.mockMvc.perform(get("/api/human")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello Mock")));
  }*/
}
