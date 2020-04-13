package gov.ua.olevsk.upszn.repo;

import gov.ua.olevsk.upszn.entity.Bank;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BankRepo extends CrudRepository<Bank, Integer> {
    List<Bank> findById(int id);
}
