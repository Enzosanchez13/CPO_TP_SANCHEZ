/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_sanchez1;

/**
 *
 * @author enzos
 */
public class TP2_bieres_SANCHEZ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'une première bière avec le constructeur
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();  // Affiche l'étiquette
        System.out.println(uneBiere);  // Affiche la bière via toString()

        // Création d'une seconde bière
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        autreBiere.lireEtiquette();  // Affiche l'étiquette
        System.out.println(autreBiere);  // Affiche la bière via toString()

        // Création d'autres bières
        BouteilleBiere biere3 = new BouteilleBiere("Heineken", 5.0f, "Heineken Brewery");
        BouteilleBiere biere4 = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");
        BouteilleBiere biere5 = new BouteilleBiere("Corona", 4.5f, "Grupo Modelo");

        // Affichage de leurs étiquettes
        System.out.println(biere3);
        System.out.println(biere4);
        System.out.println(biere5);

        // Décapsulage de quelques bières et affichage de leur état
        uneBiere.decapsuler();
        System.out.println(uneBiere);  // Bière ouverte

        biere4.decapsuler();
        System.out.println(biere4);  // Bière ouverte

        // Tentative d'ouvrir une bière déjà ouverte
        biere4.decapsuler();  // Affiche l'erreur
    }
}
