package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Town;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TownRepository extends CrudRepository<Town, Integer> {
    List<Town> findByName(String name);
}
