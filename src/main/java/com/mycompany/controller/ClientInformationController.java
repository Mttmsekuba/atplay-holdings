package com.mycompany.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mycompany.entity.Client;
import com.mycompany.service.ClientService;

import java.util.List;

/**
 * author Mamoloko
 * Date: 07/09/2020
 */

@RestController
public class ClientInformationController {

    private ClientService clientService;

    public ClientInformationController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/client")
    public ResponseEntity<Client> addClient(@RequestBody final Client client) {
        return new ResponseEntity<>(clientService.addClient(client), HttpStatus.CREATED);
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<Client> getClient(@PathVariable final Long clientId) {
        return ResponseEntity.ok(clientService.getClient(clientId));
    }

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(clientService.getClients());
    }
}
