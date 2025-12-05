package esprit.tn.spring1.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import esprit.tn.spring1.enums.TypeMenu;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_menu")
    private Long idMenu;

    @JsonProperty("libelle_menu")
    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    @JsonProperty("type_menu")
    private TypeMenu typeMenu;

    @JsonProperty("prix_total")
    private Float prixTotal;

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    @JsonProperty("id_restaurant")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Composant> composants;

    // 🔹 Ajout de la relation avec Commande
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Commande> commandes;

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
