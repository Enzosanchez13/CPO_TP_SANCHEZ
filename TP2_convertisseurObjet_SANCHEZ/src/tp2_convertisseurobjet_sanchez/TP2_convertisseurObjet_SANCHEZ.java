/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_sanchez;

import java.util.Scanner;

/**
 *
 * @author enzos
 */
public class TP2_convertisseurObjet_SANCHEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Convertisseur convertisseur1 = new Convertisseur();
            
            System.out.println("Convertisseur de températures");
            System.out.println("1 : Celsius vers Fahrenheit");
            System.out.println("2 : Fahrenheit vers Celsius");
            System.out.println("0 : Quitter");
            
            int choix;
            do {
                System.out.print("Choisissez une option : ");
                choix = scanner.nextInt();
                
                if (choix == 0) break;
                
                System.out.print("Entrez la température à convertir : ");
                double temperature = scanner.nextDouble();
                double resultat = 0;
                
                switch (choix) {
                    case 1 -> {
                        resultat = convertisseur1.celsiusVersFahrenheit(temperature);
                        System.out.println("Résultat : " + resultat + " °F");
                    }
                    case 2 -> {
                        resultat = convertisseur1.fahrenheitVersCelsius(temperature);
                        System.out.println("Résultat : " + resultat + " °C");
                    }
                    default -> System.out.println("Option invalide.");
                }
                
                System.out.println(convertisseur1);
            } while (choix != 0);
        }
    }
}