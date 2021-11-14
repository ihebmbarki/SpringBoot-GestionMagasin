package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CategorieClient;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Profession;
import tn.esprit.spring.repository.ClientRepository;

@Service
public class ClientServiceImpl {
	@Autowired
	ClientRepository cr;
	
	   public List<Client> retrieveAllClients() {
			List<Client> client = (List<Client>) cr.findAll();

			return client;
		}

		public Long addClient(Client c) {
			cr.save(c);
			return c.getIdClient();
		}

		public void deleteClient(Long id) {
			cr.deleteById(id);
		}

		public Long updateClient(Client c) {

			cr.save(c);
			return c.getIdClient();
		}

		public Client retrieveClient(Long id) {
			return cr.findById(id).get();
		}

	
		public List<Client> retrieveClientsByProfession(Profession profession) {

			List<Client> clientProfession = cr.retrieveClientsByProfession(profession);
			return clientProfession;
		}

		
		public int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession) {
			return cr.deleteClientByCategorieClientAndProfession(categorieClient, profession);
		}

	
		public int updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
			return cr.updateClientCategorieByProfession(categorieClient, profession);
		}

}