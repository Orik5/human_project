package com.dvoretskyi.human_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Human.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
//@JsonInclude(Include.NON_NULL)

public class Human /*extends ResourceSupport*/ {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String firstName;
  private String secondName;
  private String city;
  private String phoneNumber;
  /*private final String content;

  @JsonCreator
  public Human(@JsonProperty("content") String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }*/
}
