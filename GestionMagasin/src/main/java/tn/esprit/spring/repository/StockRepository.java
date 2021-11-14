package tn.esprit.spring.repository;
import tn.esprit.spring.entities.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock,Long> {

}
