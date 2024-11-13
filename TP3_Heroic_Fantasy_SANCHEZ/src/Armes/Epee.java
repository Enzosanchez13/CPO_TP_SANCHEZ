/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author enzos
 */
public class Epee extends Arme {
    // Attribut spécifique de Epee
    private final int finesse;

    // Constructeur de Epee
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Appelle le constructeur de Arme
        this.finesse = Math.min(finesse, 100); // Limite l'indice de finesse à 100
    }

    // Getter pour finesse
    public int getFinesse() {
        return finesse;
    }

    // Redéfinition de toString pour inclure la finesse
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}