package example.vacancy_jpa.mapper;

import example.vacancy_jpa.dto.SkillDTO;
import example.vacancy_jpa.entity.Skill;

import java.util.List;

public interface SkillMapper {
    SkillDTO toSkillDTO(Skill skill);
    Skill toSkillEntity(SkillDTO skillDTO);
    List<SkillDTO> toSkillDTOList(List<Skill> skillList);
}
