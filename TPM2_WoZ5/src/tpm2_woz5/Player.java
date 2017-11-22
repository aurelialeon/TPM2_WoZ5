/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

import java.util.ArrayList;

/**
 *
 * @author clemence
 */
public class Player {

    private String pseudoPlayer;
    private ArrayList<Weapon> weaponPlayer;
    private int Foooorce;

    public Player(String pseudo, ArrayList<Weapon> arme, int force) {
        this.pseudoPlayer = pseudo;
        this.weaponPlayer = arme;
        this.strengthPlayer = force;
    }

    public String getPseudo() {
        return pseudoPlayer;
    }

    public ArrayList<Weapon> getArme() {
        return weaponPlayer;  
    }

    public int getForce() {
        return strengthPlayer;
    }

    public void setPseudo(String pseudo) {
        this.pseudoPlayer = pseudo;
    }

    public void setArme(ArrayList<Weapon> arme) {
        this.weaponPlayer = arme;
    }

    public void setForce(int force) {
        this.strengthPlayer = force;
    }

}
