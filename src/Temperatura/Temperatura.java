/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

/**
 *
 * @author Yair
 */
public class Temperatura {

    private double celsius;
    private double farenheit;

    public Temperatura(double celsius, double farenheit) {
        this.celsius = celsius;
        this.farenheit = farenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double convertirCelsiusaFarenheit() {
        double farenheitConvertir = (1.8) * celsius + 32;
        return farenheitConvertir;
    }

    public double convertirFarenheitaCelsius() {
        double celsiusConvertir = (farenheit - 32) / 1.8;
        return celsiusConvertir;
    }
}
