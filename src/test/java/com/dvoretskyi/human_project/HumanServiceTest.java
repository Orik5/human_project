package com.dvoretskyi.human_project;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.repository.HumanRepository;
import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HumanServiceTest {


  @Mock
  private HumanRepository repositoryMock;
  @InjectMocks
  private HumanServiceImpl serviceMock;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testAddHuman_returnsNewHuman() {
    when(repositoryMock.save(any(Human.class))).thenReturn(new Human());
    Human human = new Human();
    assertThat(serviceMock.saveHuman(human), is(notNullValue()));
  }
}
