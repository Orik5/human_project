package com.dvoretskyi.human_project;


import static org.assertj.core.api.Assertions.assertThat;

import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class ServicesTests {

  @Autowired
  private HumanServiceImpl humanService;
/*

  @Test
  public void whenHumanIdIsProvided_thenRetrievedNameIsCorrect() {
    Mockito.when(humanService.findBySecondName("Mock Product Name");
    String testName = humanService.findBySecondName();
    Assert.assertEquals("Mock Product Name", testName);
  }
*/

  @Test
  public void contextLoads() throws Exception {
    assertThat(humanService).isNotNull();
  }
}
