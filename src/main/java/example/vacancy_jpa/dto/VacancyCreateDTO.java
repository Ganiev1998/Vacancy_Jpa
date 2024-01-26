package example.vacancy_jpa.dto;

import lombok.Builder;
import lombok.Data;

@Data@Builder
public class VacancyCreateDTO {
    private Integer id;

    private String title;

    private Double salary;
}
