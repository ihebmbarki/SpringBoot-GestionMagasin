package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.ClientService;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.ClientRepository;

@RestController
@RequestMapping
public class ClientRestController {

	@Autowired (required=false)
	ClientService clientService;
	@Autowired (required=false)
	ClientRepository clientRepository;

	@GetMapping("clientList")
	@ResponseBody
	public List<Client>getClients(){
		List<Client> listClients = clientService.retrieveAllClients();
		return listClients;
	}
	
	@GetMapping("clientList/{id}")
	public List<Client> getClientById(@PathVariable("id") String id) {

		List<Client> clients = clientService.retrieveAllClients();
		return clients;
	}

	@GetMapping("clientList/{profession}")
	@ResponseBody
	public Client getClientByProfession(@PathVariable("profession") Profession profession) {
		return (Client) clientService.retrieveClientsByProfession(profession);
	}

	@PostMapping("/addClient")
	@ResponseBody
	public Long addClient(@RequestBody Client c) {
		return clientService.addClient(c);
	}

	
	@DeleteMapping("/remove-client/{client-id}")
	@ResponseBody
	public void deleteClient(@PathVariable("client-id") Long idClient) {
	clientService.deleteClient(idClient);
	}
	//http://127.0.0.1:1997/SpringMVC/servlet/updateClient
	@PutMapping("/updateClient")
	@ResponseBody
	public Long modifyClient(@RequestBody Client c)  {
		return clientService.updateClient(c);
	}

}
