package com.mycompany.service;

import com.mycompany.repository.ClientRepository;
import org.springframework.stereotype.Service;
import com.mycompany.entity.Client;

import java.util.List;
import java.util.Optional;

/**
 * author Mamoloko
 * Date: 07/09/2020
 */

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(final ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client addClient(final Client client) {
        return clientRepository.save(client);
    }

    public Client getClient(final Long clientId) {
        final Optional<Client> client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            return client.get();
        } else {
            // Could have used Controller advise to catch this exception, but I need to do more reading and do a POC.
            throw new RuntimeException("Client with id: (" + clientId + ") not found.");
        }
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }
}
