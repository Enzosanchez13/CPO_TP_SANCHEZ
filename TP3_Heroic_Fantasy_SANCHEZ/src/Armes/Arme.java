/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author enzos
 */
public abstract class Arme {
    // Attributs de l'arme
    private final String nom;
    private final int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // Limite le niveau d'attaque à 100, si l'utilisateur tente de dépasser ce niveau
        this.niveauAttaque = (niveauAttaque <= 100) ? niveauAttaque : 100;
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'arme
    @Override
    public String toString() {
        return "Nom de l'arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}
