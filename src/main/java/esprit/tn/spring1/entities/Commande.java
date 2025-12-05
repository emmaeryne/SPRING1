package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    // Relation vers le client
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    // Relation vers le menu (obligatoire pour Menu.commandes)
    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menu;

    // Constructeurs
    public Commande() {}

    public Commande(Long idCommande, LocalDate dateCommande, Integer pourcentageRemise, Float totalRemise, Float totalCommande, Long note, Client client, Menu menu) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
        this.client = client;
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", pourcentageRemise=" + pourcentageRemise +
                ", totalRemise=" + totalRemise +
                ", totalCommande=" + totalCommande +
                ", note=" + note +
                ", client=" + (client != null ? client.getIdClient() : "null") +
                ", menu=" + (menu != null ? menu.getLibelleMenu() : "null") +
                '}';
    }
}
