package com.dvoretskyi.human_project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.hateoas.hal.CurieProvider;
import org.springframework.hateoas.hal.DefaultCurieProvider;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableHypermediaSupport(type= {HypermediaType.HAL})
public class Config {
  @Bean
  public CurieProvider curieProvider() {
    return new DefaultCurieProvider("ex", new UriTemplate("http://www.example.com/rels/{rel}"));
  }

}
