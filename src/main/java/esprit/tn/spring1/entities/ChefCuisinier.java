package esprit.tn.spring1.entities;

import esprit.tn.spring1.enums.TypeChef;
import jakarta.persistence.*;

@Entity
public class ChefCuisinier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;
    private TypeChef typeChef;

    // Constructeurs
    public ChefCuisinier() {
    }

    public ChefCuisinier(Long idChefCuisinier, String nom, String prenom, TypeChef typeChef) {
        this.idChefCuisinier = idChefCuisinier;
        this.nom = nom;
        this.prenom = prenom;
        this.typeChef = typeChef;
    }

    // Getters et Setters
    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        this.typeChef = typeChef;
    }

    @Override
    public String toString() {
        return "ChefCuisinier{" +
                "idChefCuisinier=" + idChefCuisinier +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", typeChef=" + typeChef +
                '}';
    }
}
/* FIRST VISION package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class ChefCuisinier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;
    // Note : typeChef (enum) est exclu comme demandé

    // Constructeurs
    public ChefCuisinier() {
    }

    public ChefCuisinier(Long idChefCuisinier, String nom, String prenom) {
        this.idChefCuisinier = idChefCuisinier;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "ChefCuisinier{" +
                "idChefCuisinier=" + idChefCuisinier +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}*/