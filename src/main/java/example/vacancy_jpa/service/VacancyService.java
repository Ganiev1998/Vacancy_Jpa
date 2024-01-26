package example.vacancy_jpa.service;

import example.vacancy_jpa.dto.VacancyDTO;
import example.vacancy_jpa.entity.Vacancy;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface VacancyService {
    VacancyDTO getById(Integer id);
    List<VacancyDTO> getAll();
    VacancyDTO insert(VacancyDTO vacancyDTO);
    VacancyDTO update(Integer id,VacancyDTO vacancyDTO);
    void delete(Integer id);
}
