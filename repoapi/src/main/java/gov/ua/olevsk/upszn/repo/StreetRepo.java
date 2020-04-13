package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Street;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StreetRepo extends CrudRepository<Street, Integer> {
    List<Street> findById(int id);
}
