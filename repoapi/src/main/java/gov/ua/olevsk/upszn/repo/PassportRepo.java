package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Passport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PassportRepo extends CrudRepository<Passport, Integer> {
    List<Passport> findById(int id);
}
