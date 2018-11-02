package com.dvoretskyi.human_project.controller;

import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.services.impl.HumanServiceImpl;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class HumanController {

  /**
   * The constant logger.
   */
  public static final Logger logger = LoggerFactory.getLogger(HumanController.class);

  @Autowired
  private HumanServiceImpl humanService;


  /**
   * Gets all humans.
   *
   * @return the all humans
   */
  @RequestMapping(value = "/human/list", method = RequestMethod.GET/*, produces = *//*{
      "application/hal+json"}*/)
  public List<Human> getAllHumans() {
    return humanService.findAllHumans();


  }

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
  @RequestMapping(value = "/human{id}")
  public Human getHuman(@PathVariable("id") long id) {
    return humanService.findById(id);
  }

  /**
   * Add human human.
   *
   * @param human the human
   * @return the human
   */
  @RequestMapping(value = "/add")
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
  @RequestMapping(value = "/human/{id}", method = RequestMethod.PUT)
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
  @RequestMapping(value = "/human{id}", method = RequestMethod.DELETE)
  public void updateHuman(@PathVariable long id) {
    humanService.deleteHumanById(id);
  }


}




