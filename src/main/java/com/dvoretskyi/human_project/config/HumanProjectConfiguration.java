package com.dvoretskyi.human_project.config;


import javax.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.hateoas.hal.CurieProvider;
import org.springframework.hateoas.hal.DefaultCurieProvider;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

/**
 * The type Human project configuration.
 */
@Configuration
/*@EnableSwagger2*/
//@EnableWebMvc

@EnableHypermediaSupport(type = {HypermediaType.HAL})
public class HumanProjectConfiguration /*extends WebMvcConfigurationSupport*/ {

 /* *//**
   * Api docket.
   *
   * @return the docket
   *//*
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
        //.paths(PathSelectors.any())
        .paths(regex("/humans.*"))
        .build();
  }
*/
  /**
   * Curie provider curie provider.
   *
   * @return the curie provider
   */
  @Bean
  public CurieProvider curieProvider() {
    return new DefaultCurieProvider("ex", new UriTemplate("http://www.example.com/rels/{rel}"));
  }

/*  @Override
  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry.addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }*/

  /**
   * Some filter registration filter registration bean.
   *
   * @return the filter registration bean
   */
  @Bean
  public FilterRegistrationBean someFilterRegistration() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(etagFilter());
    registration.addUrlPatterns("/api/humans*");
    registration.setName("etagFilter");
    registration.setOrder(1);
    return registration;
  }

  /**
   * Etag filter filter.
   *
   * @return the filter
   */
  @Bean(name = "etagFilter")
  public Filter etagFilter() {
    return new ShallowEtagHeaderFilter();
  }

}
