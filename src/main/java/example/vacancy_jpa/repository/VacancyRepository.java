package example.vacancy_jpa.repository;

import example.vacancy_jpa.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyRepository extends JpaRepository<Vacancy,Integer> {
}
