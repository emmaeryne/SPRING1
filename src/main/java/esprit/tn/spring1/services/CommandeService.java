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
    public void findCurrentYearCommandesOrderByNote() {
        List<Commande> commandes = commandeRepository.findCurrentYearCommandesOrderByNote();

        System.out.println("----- Commandes de l'année en cours (triées par note) -----");

        if (commandes.isEmpty()) {
            System.out.println("Aucune commande pour l'année en cours.");
            return;
        }

        commandes.forEach(c -> {
            // On utilise identifiant à la place de nom
            String clientIdentifiant = (c.getClient() != null) ? c.getClient().getIdentifiant() : "Inconnu";
            System.out.println(
                    c.getIdCommande() + " | " +
                            clientIdentifiant + " | " +
                            c.getNote()
            );
        });
    }
}
