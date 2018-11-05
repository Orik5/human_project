package com.dvoretskyi.human_project.controller;

import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Human controller.
 */
@RestController
@RequestMapping("/api")
@Api(value="humanproject")
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class HumanController {

  /**
   * The constant logger.
   */
  public static final Logger logger = LoggerFactory.getLogger(HumanController.class);
  @Autowired
  private HumanServiceImpl humanService;



  @ApiOperation(value = "View a list of humans",response = Iterable.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  }
  )
  /**
   * Gets all humans.
   *
   * @return the all humans
   */



  @RequestMapping(value = "/humans", method = RequestMethod.GET, produces = {
      "application/hal+json"})
  public List<Human> getAllHumans() {
    return  humanService.findAllHumans();


  }

  /*  List<Human> allHumans = humanService.findAllHumans();
    Link link = linkTo(HateoasController.class).withSelfRel();
    Resources<HumanDto> result = new Resources<>allHumans, link);
    return result;*/



 /* @RequestMapping(value = "/humans{id}", method = RequestMethod.GET)
  public Human getHumanById(@PathVariable long id) {
    return humanService.findById(id);
  }
*/
/*
  @RequestMapping(method = RequestMethod.GET, produces = {"application/hal+json"})
  public Resources<Human> getAllCustomers() {
    List<Human> allHumans = humanService.findAllHumans();

    for (Human human : allHumans) {
      Long humanId = human.getId();
      Link selfLink = linkTo(HumanController.class).slash(humanId).withSelfRel();
      human.add(selfLink);
      if (humanService.findById(humanId) != null) {
        Link ordersLink = linkTo(methodOn(HumanController.class)
            .getOrdersForCustomer(humanId)).withRel("allOrders");
        human.add(ordersLink);
      }
    }

    Link link = linkTo(HumanController.class).withSelfRel();
    Resources<Human> result = new Resources<Human>(allHumans, link);
    return result;
  }

  private Class<?> getOrdersForCustomer(Long humanId) {
    return null;
  }
*/

  /**
   * Gets human.
   *
   * @param id the id
   * @return the human
   */
  @ApiOperation(value = "Search human by Id",response = Human.class)
  @RequestMapping(value = "/humans{id}")
  public Human getHuman(@PathVariable("id") long id) {
    return humanService.findById(id);
  }

  /**
   * Add human human.
   *
   * @param human the human
   * @return the human
   */
  @ApiOperation(value = "Add human")
  @RequestMapping(value = "/humans")
  public Human addHuman(Human human) {
    return humanService.saveHuman(human);
  }


  /**
   * Update human response entity.
   *
   * @param human the human
   * @param id the id
   * @return the response entity
   */

  @ApiOperation(value = "Update human")
  @RequestMapping(value = "/humans/{id}", method = RequestMethod.PUT)
  public ResponseEntity<Object> updateHuman(@RequestBody Human human, @PathVariable long id) {

    Optional<Human> humanOptional = Optional.ofNullable(humanService.findById(id));

    if (!humanOptional.isPresent()) {
      return ResponseEntity.notFound().build();
    }

    human.setId(id);

    humanService.saveHuman(human);

    return ResponseEntity.noContent().build();
  }

  /**
   * Update human.
   *
   * @param id the id
   */
  @ApiOperation(value = "Delete human")
  @RequestMapping(value = "`/humans{id}", method = RequestMethod.DELETE)
  public void updateHuman(@PathVariable long id) {
    humanService.deleteHumanById(id);
  }


}




