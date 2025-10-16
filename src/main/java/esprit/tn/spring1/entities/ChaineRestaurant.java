/* FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ChaineRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestaurantation;

    private String libelle;
    private LocalDate dateCreation;

    // Constructeurs
    public ChaineRestaurant() {
    }

    public ChaineRestaurant(Long idChaineRestaurantation, String libelle, LocalDate dateCreation) {
        this.idChaineRestaurantation = idChaineRestaurantation;
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
    public Long getIdChaineRestaurantation() {
        return idChaineRestaurantation;
    }

    public void setIdChaineRestaurantation(Long idChaineRestaurantation) {
        this.idChaineRestaurantation = idChaineRestaurantation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "ChaineRestaurant{" +
                "idChaineRestaurantation=" + idChaineRestaurantation +
                ", libelle='" + libelle + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}*/



/* second package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ChaineRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestaurantation;

    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestaurant", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;

    // Constructeurs
    public ChaineRestaurant() {
    }

    public ChaineRestaurant(Long idChaineRestaurantation, String libelle, LocalDate dateCreation) {
        this.idChaineRestaurantation = idChaineRestaurantation;
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
    public Long getIdChaineRestaurantation() {
        return idChaineRestaurantation;
    }

    public void setIdChaineRestaurantation(Long idChaineRestaurantation) {
        this.idChaineRestaurantation = idChaineRestaurantation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        return "ChaineRestaurant{" +
                "idChaineRestaurantation=" + idChaineRestaurantation +
                ", libelle='" + libelle + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}*/
package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
public class ChaineRestaurant {

    // Getters et Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestaurantation;

    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestaurant", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;

    // Constructeurs
    public ChaineRestaurant() {
    }

    public ChaineRestaurant(Long idChaineRestaurantation, String libelle, LocalDate dateCreation) {
        this.idChaineRestaurantation = idChaineRestaurantation;
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "ChaineRestaurant{" +
                "idChaineRestaurantation=" + idChaineRestaurantation +
                ", libelle='" + libelle + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}

