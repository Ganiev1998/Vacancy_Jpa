package example.vacancy_jpa.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkillDTO {
    private Integer id;

    private String name;
}
