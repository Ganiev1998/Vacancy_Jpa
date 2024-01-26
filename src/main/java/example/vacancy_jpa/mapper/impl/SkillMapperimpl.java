package example.vacancy_jpa.mapper.impl;

import example.vacancy_jpa.dto.SkillDTO;
import example.vacancy_jpa.entity.Skill;
import example.vacancy_jpa.mapper.SkillMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class SkillMapperimpl implements SkillMapper {
    @Override
    public SkillDTO toSkillDTO(Skill skill) {
        return SkillDTO.builder()
                .id(skill.getId())
                .name(skill.getName())
                .build();
    }

    @Override
    public Skill toSkillEntity(SkillDTO skillDTO) {
        return Skill.builder()
                .name(skillDTO.getName())
                .build();
    }

    @Override
    public List<SkillDTO> toSkillDTOList(List<Skill> skillList) {
        return skillList.stream()
                .map(this::toSkillDTO)
                .collect(Collectors.toList());
    }
}
