package com.dvoretskyi.human_project.dto;

import com.dvoretskyi.human_project.entity.Human;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.ResourceSupport;

/**
 * The type Human dto.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)

public class HumanDto extends ResourceSupport {

  private String firstName;
  private String secondName;
  private String city;
  private String phoneNumber;
  //private String content;

  /**
   * Gets to dto.
   *
   * @param human the human
   * @return the to dto
   */
/*private final String content;

  @JsonCreator
  public Humans(@JsonProperty("content") String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }*/
  public static HumanDto convertToDto(Human human) {
    return new HumanDto(human.getFirstName(), human.getSecondName(), human.getCity(),
        human.getPhoneNumber());
  }

}
