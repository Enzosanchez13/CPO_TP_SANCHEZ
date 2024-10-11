/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_enzo.sanchez;
import java.util.Random;
import java.util.Scanner;
/**
*
* @author enzo
*/
public class TP1_guessMyNumber_ENZO {

 

    /**

     * @param args the command line arguments

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int var1 = generateurAleat.nextInt(100);
        int var2= generateurAleat.nextInt(100);
        int var3= generateurAleat.nextInt(100);
        int var4= generateurAleat.nextInt(100);
        int var5 = generateurAleat.nextInt(100);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        int choix;
        System.out.println("veuiller choisire une mode de dificulte");
        System.out.println("1) facile");
        System.out.println("2) normal");
        System.out.println("3) difficile");
        System.out.println("4) cauchemar");
        choix = sc.nextInt();
        if (choix == 1) {
            int nbalea = generateurAleat.nextInt(50);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 50 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbalea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }
            }
        }
        if (choix == 2) {
            int nbalea = generateurAleat.nextInt(100);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 100 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbalea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }
            }
        }
        if (choix == 3) {
            int nbalea = generateurAleat.nextInt(300);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 300 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbalea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                    if (tentatives >= 10) {
                        System.out.println("perdu !!! vous avez depasser les  " + tentatives + " tentatives !");
                        break;
                    }
                }
            }
        }
        if (choix == 4) {
            int nbalea = generateurAleat.nextInt(100);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 100 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives+1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                // 30% de chances de donner une mauvaise indication
                boolean mauvaiseIndication = generateurAleat.nextInt(100) < 30;
                if (mauvaiseIndication) {
                    // Donner la mauvaise indication
                    if (nbalea < saisie) {
                        System.out.println("Trop petit !");  // Mauvaise indication
                    } else {
                        System.out.println("Trop grand !");  // Mauvaise indication
                    }
                } else {
                    // Donner la bonne indication
                    if (nbalea < saisie) {
                        System.out.println("Trop grand !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                }
            }
        }
    }

}