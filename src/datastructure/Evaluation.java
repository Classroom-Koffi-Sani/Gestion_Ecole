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
public class Evaluation {
    private Integer id;
    private Date date;
    private Classe classe;
    private Matiere matiere;

    public Evaluation(Integer id, Date date, Classe classe, Matiere matiere) {
        this.id = id;
        this.date = date;
        this.classe = classe;
        this.matiere = matiere;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    
    
}
