/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Administrator
 */
public class Scolarite {
    private Integer id;
    private Float montant;
    private Eleve eleve;
    private Classe classe;

    public Scolarite(Integer id, Float montant, Eleve eleve, Classe classe) {
        this.id = id;
        this.montant = montant;
        this.eleve = eleve;
        this.classe = classe;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    
}
