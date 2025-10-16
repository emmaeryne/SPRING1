
/* FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;
    // Note : typeMenu (enum) est exclu comme demandé
    private Float prixTotal;

    // Constructeurs
    public Menu() {
    }

    public Menu(Long idMenu, String libelleMenu, Float prixTotal) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        this.prixTotal = prixTotal;
    }

    // Getters et Setters
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", libelleMenu='" + libelleMenu + '\'' +
                ", prixTotal=" + prixTotal +
                '}';
    }
}*/
/* second package esprit.tn.spring1.entities;

import esprit.tn.spring1.enums.TypeMenu;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;
    private TypeMenu typeMenu;
    private Float prixTotal;

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Composant> composants;

    // Constructeurs
    public Menu() {
    }

    public Menu(Long idMenu, String libelleMenu, TypeMenu typeMenu, Float prixTotal) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prixTotal = prixTotal;
    }

    // Getters et Setters
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Composant> getComposants() {
        return composants;
    }

    public void setComposants(List<Composant> composants) {
        this.composants = composants;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", libelleMenu='" + libelleMenu + '\'' +
                ", typeMenu=" + typeMenu +
                ", prixTotal=" + prixTotal +
                '}';
    }
}*/
package esprit.tn.spring1.entities;

import esprit.tn.spring1.enums.TypeMenu;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Menu {

    // Getters et Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;
    private TypeMenu typeMenu;
    private Float prixTotal;

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Composant> composants;

    // Constructeurs
    public Menu() {
    }

    public Menu(Long idMenu, String libelleMenu, TypeMenu typeMenu, Float prixTotal) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", libelleMenu='" + libelleMenu + '\'' +
                ", typeMenu=" + typeMenu +
                ", prixTotal=" + prixTotal +
                '}';
    }
}