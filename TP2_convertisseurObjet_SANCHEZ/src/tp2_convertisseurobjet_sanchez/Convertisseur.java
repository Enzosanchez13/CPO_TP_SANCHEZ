/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_sanchez;

/**
 *
 * @author enzos
 */
public class Convertisseur {
    private int nbConversions;

    // Constructeur
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode de conversion Celsius vers Fahrenheit
    public double celsiusVersFahrenheit(double celsius) {
        nbConversions++;
        return celsius * 9.0 / 5.0 + 32;
    }

    // Méthode de conversion Fahrenheit vers Celsius
    public double fahrenheitVersCelsius(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Méthode de conversion Celsius vers Kelvin
    public double celsiusVersKelvin(double celsius) {
        nbConversions++;
        return celsius + 273.15;
    }

    // Méthode de conversion Kelvin vers Celsius
    public double kelvinVersCelsius(double kelvin) {
        nbConversions++;
        return kelvin - 273.15;
    }

    // Méthode de conversion Fahrenheit vers Kelvin
    public double fahrenheitVersKelvin(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5.0 / 9.0 + 273.15;
    }

    // Méthode de conversion Kelvin vers Fahrenheit
    public double kelvinVersFahrenheit(double kelvin) {
        nbConversions++;
        return (kelvin - 273.15) * 9.0 / 5.0 + 32;
    }

    // Méthode pour afficher le nombre de conversions effectuées
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}
