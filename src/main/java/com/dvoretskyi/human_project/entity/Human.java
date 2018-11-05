package com.dvoretskyi.human_project.entity;


import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Human.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Human {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(notes = "The database generated human ID")
  private long id;
  @ApiModelProperty(notes = "The first name of human")
  private String firstName;
  @ApiModelProperty(notes = "The second name of human")
  private String secondName;
  @ApiModelProperty(notes = "The city of human")
  private String city;
  @ApiModelProperty(notes = "The phone number of human")
  private String phoneNumber;


}
