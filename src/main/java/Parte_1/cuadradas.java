/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte_1;

/**
 *
 * @author jhonj
 */
public class cuadradas {
    int rango;

    cuadradas(int rango) {
        this.rango = rango;
    }

    public double calcularRaiz(double operar){
            operar = Math.sqrt(operar);
        return operar;
    }
        
    public double calcularCuadrado(double operar){
            operar = Math.pow(operar, 2 );   
        return operar;
    }
    
    public double calcularCubo(double operar){
            operar = Math.pow(operar , 3);   
        return operar;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    }
    
   