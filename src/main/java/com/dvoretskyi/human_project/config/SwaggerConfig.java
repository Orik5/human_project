package com.dvoretskyi.human_project.config;

/**
 * The type Swagger config.
 */
/*@Configuration
@EnableSwagger2*/
public class SwaggerConfig {

  /**
   * Api docket.
   *
   * @return the docket
   */
/*  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
        //.paths(PathSelectors.any())
        .paths(regex("/humans.*"))
        .build();
  }*/

}
