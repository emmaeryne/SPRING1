package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;

    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;

    // Constructeurs
    public Client() {
    }

    public Client(Long idClient, String identifiant, Date datePremiereVisite) {
        this.idClient = idClient;
        this.identifiant = identifiant;
        this.datePremiereVisite = datePremiereVisite;
    }

    // Getters et Setters
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Date getDatePremiereVisite() {
        return datePremiereVisite;
    }

    public void setDatePremiereVisite(Date datePremiereVisite) {
        this.datePremiereVisite = datePremiereVisite;
    }

    // toString pour afficher l'objet
    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", identifiant='" + identifiant + '\'' +
                ", datePremiereVisite=" + datePremiereVisite +
                '}';
    }
}


/*package esprit.tn.spring1.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;

    // Constructeurs
    public Client() {
    }

    public Client(Long idClient, String identifiant, Date datePremiereVisite) {
        this.idClient = idClient;
        this.identifiant = identifiant;
        this.datePremiereVisite = datePremiereVisite;
    }

    // Getters et Setters
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Date getDatePremiereVisite() {
        return datePremiereVisite;
    }

    public void setDatePremiereVisite(Date datePremiereVisite) {
        this.datePremiereVisite = datePremiereVisite;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", identifiant='" + identifiant + '\'' +
                ", datePremiereVisite=" + datePremiereVisite +
                '}';
    }
}*/