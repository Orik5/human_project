package com.dvoretskyi.human_project;


import com.dvoretskyi.human_project.controller.HumanController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HumanProjectApplication.class})
public class ControllerTests {

  @Autowired
  private HumanController humanController;

  @Test
  public void contextLoads() throws Exception {

    Assert.assertNotNull(humanController);

  }

}
