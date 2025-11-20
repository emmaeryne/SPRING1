package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Client;
import esprit.tn.spring1.repositories.ClientRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClient {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client modifierClient(Client c) {
        // Vérifie si le client existe avant de le modifier
        if (clientRepository.existsById(c.getIdClient())) {
            return clientRepository.save(c);
        }
        return null;
    }

    @Override
    public void supprimerClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public Client afficherClient(Long idClient) {
        Optional<Client> client = clientRepository.findById(idClient);
        return client.orElse(null);
    }

    @Override
    public List<Client> listClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public void ajouterClients(List<Client> clients) {
        clientRepository.saveAll(clients);
    }
}



