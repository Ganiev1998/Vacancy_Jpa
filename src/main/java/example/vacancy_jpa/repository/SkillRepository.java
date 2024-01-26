package example.vacancy_jpa.repository;

import example.vacancy_jpa.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
}
