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
public class Eleve {
    private Integer id;
    private String nom;
    private String parent;
    private Date date;
    private String sexe;
    private Integer telephone;
    private String section;
    private Classe classe;

    public Eleve(Integer id, String nom, String parent, Date date, String sexe, Integer telephone, String section, Classe classe) {
        this.id = id;
        this.nom = nom;
        this.parent = parent;
        this.date = date;
        this.sexe = sexe;
        this.telephone = telephone;
        this.section = section;
        this.classe = classe;
    }
    public Eleve(String nom, String parent, Date date, String sexe, Integer telephone, String section, Classe classe) {
        this.nom = nom;
        this.parent = parent;
        this.date = date;
        this.sexe = sexe;
        this.telephone = telephone;
        this.section = section;
        this.classe = classe;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return parent;
    }

    public void setPrenom(String parent) {
        this.parent = parent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    
}
