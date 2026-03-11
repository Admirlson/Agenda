package com.manda.agenda.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private LocalDate date;
    private String format;
    private String type;
    private String heure;
    private String institution;
    private String objectif;
    private String statut;
    private LocalDate nouvelleDate;

    @Column(columnDefinition = "TEXT")
    private String suivis;

    private String whocreated;
    private LocalDate datecreated;
    private String whomodified;
    private LocalDate datemodified;
    @Column(name = "remimderSent")
    private boolean remimderSent;

    
    public Evenement() {
    }
    public Evenement(Integer id, LocalDate date, String format, String type, String heure, String institution,
            String objectif, String statut, LocalDate nouvelleDate, String suivis, String whocreated,
            LocalDate datecreated, String whomodified, LocalDate datemodified, boolean remimderSent) {
        this.id = id;
        this.date = date;
        this.format = format;
        this.type = type;
        this.heure = heure;
        this.institution = institution;
        this.objectif = objectif;
        this.statut = statut;
        this.nouvelleDate = nouvelleDate;
        this.suivis = suivis;
        this.whocreated = whocreated;
        this.datecreated = datecreated;
        this.whomodified = whomodified;
        this.datemodified = datemodified;
        this.remimderSent = remimderSent;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    public String getObjectif() {
        return objectif;
    }
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public LocalDate getNouvelleDate() {
        return nouvelleDate;
    }
    public void setNouvelleDate(LocalDate nouvelleDate) {
        this.nouvelleDate = nouvelleDate;
    }
    public String getSuivis() {
        return suivis;
    }
    public void setSuivis(String suivis) {
        this.suivis = suivis;
    }
    public String getWhocreated() {
        return whocreated;
    }
    public void setWhocreated(String whocreated) {
        this.whocreated = whocreated;
    }
    public LocalDate getDatecreated() {
        return datecreated;
    }
    public void setDatecreated(LocalDate datecreated) {
        this.datecreated = datecreated;
    }
    public String getWhomodified() {
        return whomodified;
    }
    public void setWhomodified(String whomodified) {
        this.whomodified = whomodified;
    }
    public LocalDate getDatemodified() {
        return datemodified;
    }
    public void setDatemodified(LocalDate datemodified) {
        this.datemodified = datemodified;
    }
    public boolean isRemimderSent() {
        return remimderSent;
    }
    public void setRemimderSent(boolean remimderSent) {
        this.remimderSent = remimderSent;
    }

    
}
