/* EXo 2 TD C ENZO SANCHEZ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author enzos
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
 // nombre d'entiers a additionner
int result; // resultat
int ind; //indice

result=0;


int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier




// Addition des nb premiers entiers
ind=1;
while (result <= nb) {
   result=result+ind;
  }
//Afficher le résultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
    
}
}