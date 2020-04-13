package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Accountant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountantRepo extends CrudRepository<Accountant, Integer> {
    List<Accountant> findById(int id);
    List<Accountant> findBySurname(String surname);
    List<Accountant> findByName(String name);
    List<Accountant> findByPatronymic(String patronymic);
}
