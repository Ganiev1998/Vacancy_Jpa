package example.vacancy_jpa.service.impl;

import example.vacancy_jpa.dto.SkillDTO;
import example.vacancy_jpa.entity.Skill;
import example.vacancy_jpa.mapper.SkillMapper;
import example.vacancy_jpa.repository.SkillRepository;
import example.vacancy_jpa.service.SkillService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkillServiceimpl implements SkillService {
    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;
    @Override
    public SkillDTO getSkill(Integer id) {
        return skillMapper
                .toSkillDTO(skillRepository
                        .getReferenceById(id));
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        return skillMapper
                .toSkillDTOList(skillRepository
                        .findAll());
    }

    @Override
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = skillMapper
                .toSkillEntity(skillDTO);

        skill = skillRepository
                .save(skill);

        return skillMapper
                .toSkillDTO(skill);
    }

    @Override
    public SkillDTO updateSkill(Integer id, SkillDTO skillDTO) {
        Skill skill = skillRepository.getReferenceById(id);

        skill.setName(skillDTO.getName());

        return skillMapper
                .toSkillDTO(skillRepository
                        .save(skill));
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepository
                .deleteById(id);
    }
}
