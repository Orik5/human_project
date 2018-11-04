package com.dvoretskyi.human_project.controller;

import com.dvoretskyi.human_project.dto.HumanDto;
import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class HateoasController {
  @Autowired
  private HumanServiceImpl humanService;

//  private static final String TEMPLATE = "Hello, %s!";

/*
  @RequestMapping("/humans")
  public HttpEntity<HumanDto> humanDtoHttpEntity(
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

    HumanDto humanDto = new HumanDto(String.format(TEMPLATE, name));
    humanDto.add(linkTo(methodOn(HateoasController.class).humanDtoHttpEntity(name)).withSelfRel());

    return new ResponseEntity<>(humanDto, HttpStatus.OK);
  }
*/



  @RequestMapping(value = "/humans/all", method = RequestMethod.GET, produces = {
      "application/hal+json"})
  @ResponseBody
  public List<HumanDto> findAllHumanDto() {
    return humanService.findAllHumansDto();
  }

  /*@RequestMapping(value = "/humans/all", method = RequestMethod.POST)
  public HumanDto addHuman(@RequestBody HumanAddDto dto) {
    return humanService.saveHuman(dto.getFirstName(), dto.getSecondName(), dto.getCity(), dto.getPhoneNumber());
  }*/
}
