/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_sanchez;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author enzos
 */
public class TP3_Heroic_Fantasy_SANCHEZ {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Création des objets Epee
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création des objets Baton
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Création de la liste dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes à la liste
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques de chaque arme
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i).toString());
        }
    }
}
