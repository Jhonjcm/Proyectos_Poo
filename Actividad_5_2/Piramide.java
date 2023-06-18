/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_5_2;


public class Piramide extends FiguraGeométrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }

    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2.0);
        double areaLado = 2.0 * base * apotema;
        return areaBase + areaLado;
    }
}