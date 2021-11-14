package tn.esprit.spring.service;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.ProduitRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl {
@Autowired
ProduitRepository pr;

public List <Produit> retrieveAllProduits() {
	        List<Produit> produits = new ArrayList<>();
	        pr.findAll();
	        return produits;
	    }
Produit retrieveProduit(Long id){
	return pr.findById(id).get();
}
//Produit addProduit(Produit p, Long idRayon, Long idStock){
	//return pr.create();
      
//}

}
