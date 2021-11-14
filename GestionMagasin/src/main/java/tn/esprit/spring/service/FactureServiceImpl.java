package tn.esprit.spring.service;
import tn.esprit.spring.repository.*;
import tn.esprit.spring.entities.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureServiceImpl {
	@Autowired
	FactureRepository fc;
	List<Facture> retrieveAllFactures(){
		List<Facture> factures = new ArrayList<>();
        fc.findAll();
        return factures;
	}
	Facture retrieveFacture(Long id){
		return fc.findById(id).get();
	}
}
