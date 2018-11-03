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
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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

  //Using Answer to set an id to the customer which is passed in as a parameter to the mock method.
  @Test
  public void testAddHuman_returnsNewHumanWithId() {
    when(repositoryMock.save(any(Human.class))).thenAnswer(new Answer<Human>() {
      @Override
      public Human answer(InvocationOnMock invocation) throws Throwable {
        Object[] arguments = invocation.getArguments();
        if (arguments != null && arguments.length > 0 && arguments[0] != null) {
          Human human = (Human) arguments[0];
          human.setId(1);
          return human;
        }
        return null;
      }
    });
    Human human = new Human();
    assertThat(serviceMock.saveHuman(human), is(notNullValue()));
  }

  //Throwing an exception from the mocked method
  @Test(expected = RuntimeException.class)
  public void testAddHuman_throwsException() {
    when(repositoryMock.save(any(Human.class))).thenThrow(RuntimeException.class);
    Human human = new Human();
    serviceMock.saveHuman(human);//
  }
}
