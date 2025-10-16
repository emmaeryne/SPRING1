package esprit.tn.spring1.repositories;

import esprit.tn.spring1.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    // 1️⃣ Liste des commandes par client
    List<Commande> findByClient_IdClient(Long idClient);
    // 2️⃣ Liste des commandes par client entre deux dates
    List<Commande>    findByClient_IdClientAndDateCommandeBetween(Long idClient, LocalDate dateDebut, LocalDate dateFin);

    // 3️⃣ Liste des commandes entre deux dates ordonnées par note décroissante
    List<Commande> findByDateCommandeBetweenOrderByNoteDesc(LocalDate dateDebut, LocalDate dateFin);
}