/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

/**
 *
 * @author Utilisateur
 */
public class Weapon {
    private String nom;
    private int degats;

    public Weapon(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public int getDegats() {
        return degats;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }
    
}
