/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Note {
    private Integer id;
    private Eleve eleve;
    private Classe classe;
    private Matiere matiere;
    private Evaluation evaluation;
    private Float valeur;

    public Note(Integer id, Eleve eleve, Classe classe, Matiere matiere, Evaluation evaluation, Float valeur) {
        this.id = id;
        this.eleve = eleve;
        this.classe = classe;
        this.matiere = matiere;
        this.evaluation = evaluation;
        this.valeur = valeur;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Float getValeur() {
        return valeur;
    }

    public void setValeur(Float valeur) {
        this.valeur = valeur;
    }
    
    
    
}
