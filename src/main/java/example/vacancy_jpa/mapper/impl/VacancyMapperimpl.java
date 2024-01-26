package example.vacancy_jpa.mapper.impl;

import example.vacancy_jpa.dto.VacancyDTO;
import example.vacancy_jpa.entity.Vacancy;
import example.vacancy_jpa.mapper.VacancyMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class VacancyMapperimpl implements VacancyMapper {
    @Override
    public VacancyDTO toVacancyDTO(Vacancy vacancy) {
        return VacancyDTO.builder().id(vacancy.getId()).title(vacancy.getTitle())
                .salary(vacancy.getSalary()).skills(vacancy.getSkills()).build();
    }

    @Override
    public Vacancy toVacancyENT(VacancyDTO vacancyDTO) {
        return Vacancy.builder().id(vacancyDTO.getId()).title(vacancyDTO.getTitle())
                .salary(vacancyDTO.getSalary()).skills(vacancyDTO.getSkills()).build();
    }

    @Override
    public List<VacancyDTO> toVacancyDTOList(List<Vacancy> vacancyList) {
        return vacancyList.stream().map(this::toVacancyDTO).collect(Collectors.toList());
    }
}
