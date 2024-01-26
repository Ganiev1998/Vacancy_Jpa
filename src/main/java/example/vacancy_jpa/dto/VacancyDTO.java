package example.vacancy_jpa.dto;

import example.vacancy_jpa.entity.Skill;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class VacancyDTO {
    private Integer id;

    private String title;

    private Double salary;

    private Set<Skill> skills = new HashSet<>();
}
