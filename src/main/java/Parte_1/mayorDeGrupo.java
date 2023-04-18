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
public class mayorDeGrupo {
    int rango;

    public double determinarMayor(double [] lista){
        double comparador = 0;
        for (int i = 0; i < getRango(); i+=1){
            if (comparador < lista[i]){
                comparador = lista[i];
            }
        }
        return comparador;
    }
    
    public mayorDeGrupo(int rango) {
        this.rango = rango;
    }
    
    
    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
    
    
}
