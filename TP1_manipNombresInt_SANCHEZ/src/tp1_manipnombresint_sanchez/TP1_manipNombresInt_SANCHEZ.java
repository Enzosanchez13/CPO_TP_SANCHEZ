/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_sanchez;

import java.util.Scanner;

/**TP1 Enzo SANCHEZ
 *
 * @author enzos
 */
public class TP1_manipNombresInt_SANCHEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

       // initialisation de toutes les variables du code

       int nb1;
       int nb2;
       int somme;
       int produit;
       int difference;
       int division;
       int divisionmod;
       //demande des saisie des 2 nombre
       System.out.println("saisir deux nombres ");
       nb1=sc.nextInt();
       nb2=sc.nextInt();
        System.out.println("le premier nombre est "+nb1+" et le second est "+nb2);
        // clacule de la somme, du produit et de la differance
        somme = nb1+nb2;
        produit = nb1*nb2;
        difference = nb1-nb2;
        System.out.println("la somme de ses deux nombre est : "+somme);
        System.out.println("le produit de ses deux nombre est : "+produit);
        System.out.println("la difference de ses deux nombre est : "+difference);
         // clacule de la eivision euclidiene
        division = nb1/nb2;
        divisionmod = nb1%nb2;
        System.out.println("le quotient entier de la division euclidienne est : "+division+" est sont reste est :"+divisionmod);

 

           

    }

}
