/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_5_2;


public class Esfera extends FiguraGeométrica {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return volumen;
    }

    public double calcularSuperficie() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return superficie;
    }
}