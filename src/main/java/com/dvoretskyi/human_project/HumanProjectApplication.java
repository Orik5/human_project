package com.dvoretskyi.human_project;

import com.dvoretskyi.human_project.entity.Human;
import com.dvoretskyi.human_project.repository.HumanRepository;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The type Human project application.
 */
@SpringBootApplication

public class HumanProjectApplication {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(HumanProjectApplication.class, args);
  }

  @Bean
  public CommandLineRunner istertingIntoDatabase(HumanRepository humanRepository) {
    return (args) -> {
      // save a couple of customers
      humanRepository.save(new Human(1, "Yura", "Huh", "Lviv", "+44343468"));
      humanRepository.save(new Human(2, "Cul", "Walter", "Kyiv", "+388909778"));
      humanRepository.save(new Human(3, "Mykola", "Bob", "Mumbai", "+3398909"));
      humanRepository.save(new Human(4, "David", "Palmer", "Saul", "+3478890"));
      humanRepository.save(new Human(5, "Max", "Tony", "Ohtyrka", "+33235t78"));

      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (Human human : humanRepository.findAll()) {
        log.info(humanRepository.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      humanRepository.findById(1L)
          .ifPresent(human -> {
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(human.toString());
            log.info("");
          });

      // fetch customers by last name
      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
   /*   humanRepository.findBySecondName("Yura").forEach(yura -> {
        log.info(yura.toString());
      });*/
       /*for (Human bob : humanRepository.findBySecondName("Bob")) {
       	log.info(bob.toString());
       }*/
      log.info("");
    };
  }
}
