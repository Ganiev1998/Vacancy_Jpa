package example.vacancy_jpa.service.impl;

import example.vacancy_jpa.dto.VacancyDTO;
import example.vacancy_jpa.entity.Skill;
import example.vacancy_jpa.entity.Vacancy;
import example.vacancy_jpa.mapper.SkillMapper;
import example.vacancy_jpa.mapper.VacancyMapper;
import example.vacancy_jpa.repository.SkillRepository;
import example.vacancy_jpa.repository.VacancyRepository;
import example.vacancy_jpa.service.VacancyService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Data
@Service
public class VacancyServiceimpl implements VacancyService {
    private final VacancyMapper vacancyMapper;
    private final VacancyRepository vacancyRepository;
    private final SkillMapper skillMapper;
    private final SkillRepository skillRepository;
    @Override
    public VacancyDTO getById(Integer id) {
        return vacancyMapper.toVacancyDTO(vacancyRepository.getReferenceById(id));
    }

    @Override
    public List<VacancyDTO> getAll() {
        return vacancyMapper.toVacancyDTOList(vacancyRepository.findAll());
    }

    @Override
    public VacancyDTO insert(VacancyDTO vacancyDTO) {
        Vacancy vacancy = vacancyMapper.toVacancyENT(vacancyDTO);
        vacancy = vacancyRepository.save(vacancy);
        return vacancyMapper.toVacancyDTO(vacancy);
    }

    
    @Override
    public VacancyDTO update(Integer id, VacancyDTO vacancyDTO) {
        Vacancy vacancy = vacancyRepository.getReferenceById(id);
        vacancy.setTitle(vacancyDTO.getTitle());
        vacancy.setSalary(vacancyDTO.getSalary());
        vacancy.setSkills(vacancyDTO.getSkills());
        return vacancyMapper.toVacancyDTO(vacancyRepository.save(vacancy));
    }

    @Override
    public void delete(Integer id) {
        vacancyRepository.deleteById(id);
    }
}
