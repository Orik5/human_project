package com.dvoretskyi.human_project;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.junit.Test;
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

  @Test
  public void humanShouldReturnMessageFromService() throws Exception {
    when(service.findBySecondName(""));
    this.mockMvc.perform(get("/api/human")).andDo(print()).andExpect(status().isOk());
  }
}
