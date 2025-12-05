package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Commande;
import esprit.tn.spring1.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    // Commandes par client
    public List<Commande> getCommandesParClient(Long idClient) {
        return commandeRepository.findByClient_IdClient(idClient);
    }

    // Commandes par client entre deux dates
    public List<Commande> getCommandesParClientEntreDates(Long idClient, LocalDate debut, LocalDate fin) {
        return commandeRepository.findByClient_IdClientAndDateCommandeBetween(idClient, debut, fin);
    }

    // Commandes entre deux dates, triées par note décroissante
    public List<Commande> getCommandesEntreDatesOrdreNote(LocalDate debut, LocalDate fin) {
        return commandeRepository.findByDateCommandeBetweenOrderByNoteDesc(debut, fin);
    }

    // Commandes de l'année en cours, triées par note décroissante

    public List<Commande> findCurrentYearCommandesOrderByNote() {
        LocalDate startOfYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        LocalDate endOfYear = LocalDate.of(LocalDate.now().getYear(), 12, 31);

        List<Commande> commandes = commandeRepository.findCurrentYearCommandesOrderByNote(startOfYear, endOfYear);

        commandes.forEach(c -> {
            String clientIdentifiant = (c.getClient() != null) ? c.getClient().getIdentifiant() : "Inconnu";
            System.out.println(c.getIdCommande() + " | " + clientIdentifiant + " | " + c.getNote());
        });

        return commandes;
    }

    // Méthode pour récupérer toutes les commandes
    public List<Commande> getAllCommandes() {
        System.out.println("Récupération de toutes les commandes...");
        return commandeRepository.findAll(); // Retourne la liste réelle des commandes
    }

    // Méthode de test qui lève une exception
    public void testException() {
        System.out.println("Méthode qui va lancer une exception !");
        throw new RuntimeException("Exception volontaire pour tester l'aspect");
    }



  /*  public void findCurrentYearCommandesOrderByNote() {
        LocalDate startOfYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        LocalDate endOfYear = LocalDate.of(LocalDate.now().getYear(), 12, 31);

        List<Commande> commandes = commandeRepository.findCurrentYearCommandesOrderByNote(startOfYear, endOfYear);

        System.out.println("----- Commandes de l'année en cours (triées par note) -----");

        if (commandes.isEmpty()) {
            System.out.println("Aucune commande pour l'année en cours.");
            return;
        }

        commandes.forEach(c -> {
            String clientIdentifiant = (c.getClient() != null) ? c.getClient().getIdentifiant() : "Inconnu";
            System.out.println(
                    c.getIdCommande() + " | " +
                            clientIdentifiant + " | " +
                            c.getNote()
            );
        });
    }*/

}
