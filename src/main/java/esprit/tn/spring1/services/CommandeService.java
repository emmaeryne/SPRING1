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

    public List<Commande> getCommandesParClient(Long idClient) {
        return commandeRepository.findByClient_IdClient(idClient);
    }

    public List<Commande> getCommandesParClientEntreDates(Long idClient, LocalDate debut, LocalDate fin) {
        return commandeRepository.findByClient_IdClientAndDateCommandeBetween(idClient, debut, fin);
    }

    public List<Commande> getCommandesEntreDatesOrdreNote(LocalDate debut, LocalDate fin) {
        return commandeRepository.findByDateCommandeBetweenOrderByNoteDesc(debut, fin);
    }
}

