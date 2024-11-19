/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

import arme.arme;

/**
 *
 * @author enzos
 */
public class baton extends arme {
    // Attribut spécifique de baton
    private final int age;

    // Constructeur de baton
    public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appelle le constructeur de arme
        this.age = Math.min(age, 100); // Limite l'âge à 100
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Redéfinition de toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}
