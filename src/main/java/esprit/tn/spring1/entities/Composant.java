package esprit.tn.spring1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Composant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menu;

    @OneToMany(mappedBy = "composant", cascade = CascadeType.ALL)
    private List<DetailComposant> detailComposants;

    // Constructeurs
    public Composant() {
    }

    public Composant(Long idComposant, String nomComposant, Float prix) {
        this.idComposant = idComposant;
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    // Getters et Setters
    public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<DetailComposant> getDetailComposants() {
        return detailComposants;
    }

    public void setDetailComposants(List<DetailComposant> detailComposants) {
        this.detailComposants = detailComposants;
    }

    @Override
    public String toString() {
        return "Composant{" +
                "idComposant=" + idComposant +
                ", nomComposant='" + nomComposant + '\'' +
                ", prix=" + prix +
                '}';
    }
}

/* FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class Composant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    // Constructeurs
    public Composant() {
    }

    public Composant(Long idComposant, String nomComposant, Float prix) {
        this.idComposant = idComposant;
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    // Getters et Setters
    public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Composant{" +
                "idComposant=" + idComposant +
                ", nomComposant='" + nomComposant + '\'' +
                ", prix=" + prix +
                '}';
    }
}*/