package example.vacancy_jpa.service;

import example.vacancy_jpa.dto.SkillDTO;

import java.util.List;

public interface SkillService {
    SkillDTO getSkill(Integer id);
    List<SkillDTO> getAllSkills();

    SkillDTO createSkill(SkillDTO skillDTO);
    SkillDTO updateSkill(Integer id,SkillDTO skillDTO);
    void deleteSkill(Integer id);
}
