/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.test;

import edu.esprit.entites.Personne;

/**
 *
 * @author mahmo
 */
public class MainClass {
    public static void main(String[] args) {
        Personne p1 =  Personne.getInstance();
        Personne p2 = Personne.getInstance();
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
