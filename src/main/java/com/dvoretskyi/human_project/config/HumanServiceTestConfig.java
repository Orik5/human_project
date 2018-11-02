package com.dvoretskyi.human_project.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class HumanServiceTestConfig {
@Bean
@Primary
  public HumanServiceImla humanServiceIml(){

  return Mockito.mock(HumanServiceIml.class);
}
}
