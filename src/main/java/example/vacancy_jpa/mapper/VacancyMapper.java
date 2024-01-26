package example.vacancy_jpa.mapper;

import example.vacancy_jpa.dto.VacancyDTO;
import example.vacancy_jpa.entity.Vacancy;

import java.util.List;

public interface VacancyMapper {
    VacancyDTO toVacancyDTO(Vacancy vacancy);
    Vacancy toVacancyENT(VacancyDTO vacancyDTO);
    List<VacancyDTO> toVacancyDTOList(List<Vacancy> vacancyList);
}
