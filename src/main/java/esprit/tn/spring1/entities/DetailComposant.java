/*package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class DetailComposant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float tmc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @ManyToOne
    @JoinColumn(name = "idComposant")
    private Composant composant;

    // Constructeurs
    public DetailComposant() {
    }

    public DetailComposant(Long idDetailComposant, Float tmc, TypeComposant typeComposant) {
        this.idDetailComposant = idDetailComposant;
        this.tmc = tmc;
        this.typeComposant = typeComposant;
    }

    // Getters et Setters
    public Long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public Float getTmc() {
        return tmc;
    }

    public void setTmc(Float tmc) {
        this.tmc = tmc;
    }

    public TypeComposant getTypeComposant() {
        return typeComposant;
    }

    public void setTypeComposant(TypeComposant typeComposant) {
        this.typeComposant = typeComposant;
    }

    public Composant getComposant() {
        return composant;
    }

    public void setComposant(Composant composant) {
        this.composant = composant;
    }

    @Override
    public String toString() {
        return "DetailComposant{" +
                "idDetailComposant=" + idDetailComposant +
                ", tmc=" + tmc +
                ", typeComposant=" + typeComposant +
                '}';
    }
}*/

package esprit.tn.spring1.entities;

import jakarta.persistence.*;

@Entity
public class DetailComposant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float tmc;
    // Note : typeComposant (enum) est exclu comme demandé

    // Constructeurs
    public DetailComposant() {
    }

    public DetailComposant(Long idDetailComposant, Float tmc) {
        this.idDetailComposant = idDetailComposant;
        this.tmc = tmc;
    }

    // Getters et Setters
    public Long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public Float getTmc() {
        return tmc;
    }

    public void setTmc(Float tmc) {
        this.tmc = tmc;
    }

    @Override
    public String toString() {
        return "DetailComposant{" +
                "idDetailComposant=" + idDetailComposant +
                ", tmc=" + tmc +
                '}';
    }
}