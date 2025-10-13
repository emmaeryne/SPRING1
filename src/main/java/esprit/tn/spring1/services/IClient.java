package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Client;
import java.util.List;

public interface IClient {

    Client ajouterClient(Client c);

    Client modifierClient(Client c);

    void supprimerClient(Long idClient);

    Client afficherClient(Long idClient);

    List<Client> listClients(); // méthode correcte pour lister tous les clients

    void ajouterClients(List<Client> clients); // méthode pour ajouter plusieurs clients
}
