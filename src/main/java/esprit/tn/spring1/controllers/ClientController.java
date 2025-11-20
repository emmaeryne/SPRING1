package esprit.tn.spring1.controllers;

import esprit.tn.spring1.entities.Client;
import esprit.tn.spring1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // GET all clients - http://localhost:8080/clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.listClients();
    }

    // GET client by ID - http://localhost:8080/clients/{id}
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.afficherClient(id);
    }

    // POST create new client - http://localhost:8080/clients
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    // PUT update client - http://localhost:8080/clients
    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    // DELETE client - http://localhost:8080/clients/{id}
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }

    // POST add multiple clients - http://localhost:8080/clients/batch
    @PostMapping("/batch")
    public void addMultipleClients(@RequestBody List<Client> clients) {
        clientService.ajouterClients(clients);
    }
}