package com.dvoretskyi.human_project;


import static org.assertj.core.api.Assertions.assertThat;

import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HumanProjectApplication.class})
public class ServicesTests {

  @Autowired
  private HumanServiceImpl humanService;


  @Test
  public void contextLoads() throws Exception {
    assertThat(humanService).isNotNull();
  }
}
