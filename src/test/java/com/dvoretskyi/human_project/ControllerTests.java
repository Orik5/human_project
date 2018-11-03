package com.dvoretskyi.human_project;


import static org.junit.Assert.assertEquals;

import com.dvoretskyi.human_project.entity.Human;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class ControllerTests extends AbstractTest {

  @Override
  @Before
  protected void setUp() {
    super.setUp();
  }
/*  @Test
  public void getHumanList() throws Exception {
    String uri = "/api/humans";
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
        .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    Human[] humans = super.mapFromJson(content, Human[].class);
    assertTrue(humans.length > 0);
  }*/


  @Test
  public void createHuman() throws Exception {
    String uri = "/api/humans";
    Human human = new Human();
    human.setId(11);
    human.setFirstName("Maria");
    String inputJson = super.mapToJson(human);
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .content(inputJson)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(201, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, "Human is created successfully");
  }
/*


  @Test
  public void updateHuman() throws Exception {
    String uri = "/human/2";
    Human human = new Human();
    human.setFirstName("Georg");
    String inputJson = super.mapToJson(human);
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .content(inputJson)).andReturn();

    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, "Human is updated successsfully");
  }
*/

/*
  @Test
  public void deleteHuman() throws Exception {
    String uri = "/human";
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
    int status = mvcResult.getResponse().getStatus();
    assertEquals(200, status);
    String content = mvcResult.getResponse().getContentAsString();
    assertEquals(content, " Human is deleted successsfully");
  }*/

}
