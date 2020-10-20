package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Client;



@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Client> list(){
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Gabriel");
		client1.setEmail("gabriel@gabriel.com");
		client1.setPhone("61 33333-4444");
		
		var client2 = new Client();
		client2.setId(1L);
		client2.setName("Amanda");
		client2.setEmail("amanda@amanda.com");
		client2.setPhone("21 22222-3333");
		
		return Arrays.asList(client1, client2);
	}

}
