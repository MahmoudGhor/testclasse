/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entites;

/**
 *
 * @author mahmo
 */
public class Personne {
    public int id;
    public String nom;
    public String prenom;
    public static Personne instance;

    private Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    private Personne() {
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    //classe statful
    public static Personne getInstance(){
        if (instance == null)
        {
            instance = new Personne();
        }
        return instance;
    }
    
    
}
