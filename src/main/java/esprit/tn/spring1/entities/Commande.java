
/* FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    // Constructeurs
    public Commande() {
    }

    public Commande(Long idCommande, LocalDate dateCommande, Integer pourcentageRemise, Float totalRemise, Float totalCommande, Long note) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
    }

    // Getters et Setters
    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public Float getTotalRemise() {
        return totalRemise;
    }

    public void setTotalRemise(Float totalRemise) {
        this.totalRemise = totalRemise;
    }

    public Float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(Float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public Long getNote() {
        return note;
    }

    public void setNote(Long note) {
        this.note = note;
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
                '}';
    }
}*/
/* second package esprit.tn.spring1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    // Constructeurs
    public Commande() {
    }

    public Commande(Long idCommande, LocalDate dateCommande, Integer pourcentageRemise, Float totalRemise, Float totalCommande, Long note) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
    }

    // Getters et Setters
    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public Float getTotalRemise() {
        return totalRemise;
    }

    public void setTotalRemise(Float totalRemise) {
        this.totalRemise = totalRemise;
    }

    public Float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(Float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public Long getNote() {
        return note;
    }

    public void setNote(Long note) {
        this.note = note;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
                '}';
    }
}*/
package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Commande {

    // Getters et Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    // Suppression de la relation @ManyToMany avec ChefCuisinier

    // Constructeurs
    public Commande() {
    }

    public Commande(Long idCommande, LocalDate dateCommande, Integer pourcentageRemise, Float totalRemise, Float totalCommande, Long note) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
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
                '}';
    }
}