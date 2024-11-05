/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_sanchez;

/**
 *
 * @author enzos
 */
public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire;  // Relation : la voiture a un propriétaire

    // Constructeur qui initialise les attributs, avec propriétaire initialisé à null
    public Voiture(String modele, String marque, int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null;  // Pas de propriétaire initialement
    }

    // Méthode toString pour afficher les informations de la voiture
    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", puissance=" + puissance +
                ", proprietaire=" + (proprietaire != null ? proprietaire.nom : "aucun") +
                '}';
    }
}