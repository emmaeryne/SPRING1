/*  FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    // Constructeurs
    public Restaurant() {
    }

    public Restaurant(Long idRestaurant, String nom, Long nbPlacesMax) {
        this.idRestaurant = idRestaurant;
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    // Getters et Setters
    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "idRestaurant=" + idRestaurant +
                ", nom='" + nom + '\'' +
                ", nbPlacesMax=" + nbPlacesMax +
                '}';
    }
}*/



/* SECOND package esprit.tn.spring1.entities;

import jakarta.persistence.*;

import java.awt.*;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "idChaineRestaurantation")
    private ChaineRestaurant chaineRestaurant;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menus;

    // Constructeurs
    public Restaurant() {
    }

    public Restaurant(Long idRestaurant, String nom, Long nbPlacesMax) {
        this.idRestaurant = idRestaurant;
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    // Getters et Setters
    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public ChaineRestaurant getChaineRestaurant() {
        return chaineRestaurant;
    }

    public void setChaineRestaurant(ChaineRestaurant chaineRestaurant) {
        this.chaineRestaurant = chaineRestaurant;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "idRestaurant=" + idRestaurant +
                ", nom='" + nom + '\'' +
                ", nbPlacesMax=" + nbPlacesMax +
                '}';
    }
}*/
package esprit.tn.spring1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "idChaineRestaurantation")
    private ChaineRestaurant chaineRestaurant;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menus;

    // Constructeurs
    public Restaurant() {
    }

    public Restaurant(Long idRestaurant, String nom, Long nbPlacesMax) {
        this.idRestaurant = idRestaurant;
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    // Getters et Setters
    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public ChaineRestaurant getChaineRestaurant() {
        return chaineRestaurant;
    }

    public void setChaineRestaurant(ChaineRestaurant chaineRestaurant) {
        this.chaineRestaurant = chaineRestaurant;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "idRestaurant=" + idRestaurant +
                ", nom='" + nom + '\'' +
                ", nbPlacesMax=" + nbPlacesMax +
                '}';
    }
}


