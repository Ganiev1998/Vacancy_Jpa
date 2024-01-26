package example.vacancy_jpa.controller;

import example.vacancy_jpa.dto.VacancyDTO;
import example.vacancy_jpa.service.VacancyService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacancy")
@Data
public class VacancyController {
    private final VacancyService vacancyService;
    @GetMapping
    public List<VacancyDTO> get(){
        return vacancyService.getAll();
    }
    @GetMapping("/{id}")
    public VacancyDTO getById(@PathVariable Integer id){
        return vacancyService.getById(id);
    }
    @PostMapping
    public VacancyDTO insert(@RequestBody VacancyDTO vacancyDTO){
        return vacancyService.insert(vacancyDTO);
    }
    @PutMapping("/{id}")
    public VacancyDTO update(@PathVariable Integer id,@RequestBody VacancyDTO vacancyDTO){
        return vacancyService.update(id,vacancyDTO);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        vacancyService.delete(id);
        return "deleted";
    }
}
