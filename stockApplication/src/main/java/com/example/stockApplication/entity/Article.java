package com.example.stockApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Article {

    @Id
    private String libelle;
    private int quantite;

    public Article(String libelle, int quantite) {
        this.libelle = libelle;
        this.quantite = quantite;
    }

    public String getLibelle() { return libelle; }
    public void setlibelle(String libelle) { this.libelle = libelle; }
    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }
}
