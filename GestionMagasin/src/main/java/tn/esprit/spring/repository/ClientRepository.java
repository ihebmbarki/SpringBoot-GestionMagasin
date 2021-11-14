package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
	//Select
		@Query("SELECT c FROM Client c WHERE c.profession= ?1")
		List<Client> retrieveClientsByProfession(Profession profession);

		//delete
		@Modifying
		@Query("DELETE FROM Client c WHERE c.categorieClient= :categorie AND c.profession = :profession")
		int deleteClientByCategorieClientAndProfession(@Param("categorie") CategorieClient categorieClient,
				@Param("profession") Profession profession);
	//Update
		@Modifying
		@Query("update Client c set c.categorieClient = :categorie where c.profession =	:profession")
		int updateClientCategorieByProfession(@Param("categorie") CategorieClient categorieClient,
				@Param("profession") Profession profession);
		
	

}