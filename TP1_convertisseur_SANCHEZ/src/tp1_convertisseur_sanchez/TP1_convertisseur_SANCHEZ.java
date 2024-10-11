/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_sanchez;

/**TP 1 Enzo Sanchez exo 2
 *
 * @author enzos
 */
import java.util.Scanner;

public class TP1_convertisseur_SANCHEZ {

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double Farenheit) {
        return (Farenheit - 32) / 1.8;
    }

    public static double CelciusVersFarenheit(double celcius) {
        return (celcius * 1.8) + 32;
    }

    public static double KelvinVersFarenheit(double kelvin) {
        double celsius = KelvinVersCelcius(kelvin);
        return CelciusVersFarenheit(celsius);
    }

    public static double FarenheitVersKelvin(double Farenheit) {
        double celsius = FarenheitVersCelcius(Farenheit);
        return CelciusVersKelvin(celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        double nbr = sc.nextDouble(); // Use nextDouble to allow decimal inputs

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = sc.nextInt(); // Use nextInt to get the user's choice

        switch (choix) {
            case 1:
                System.out.println(nbr + " degrés Celsius est égal à " + CelciusVersKelvin(nbr) + " degrés Kelvin");
                break;
            case 2:
                System.out.println(nbr + " degrés Kelvin est égal à " + KelvinVersCelcius(nbr) + " degrés Celsius");
                break;
            case 3:
                System.out.println(nbr + " degrés Fahrenheit est égal à " + FarenheitVersCelcius(nbr) + " degrés Celsius");
                break;
            case 4:
                System.out.println(nbr + " degrés Celsius est égal à " + CelciusVersFarenheit(nbr) + " degrés Fahrenheit");
                break;
            case 5:
                System.out.println(nbr + " degrés Kelvin est égal à " + KelvinVersFarenheit(nbr) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println(nbr + " degrés Fahrenheit est égal à " + FarenheitVersKelvin(nbr) + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
