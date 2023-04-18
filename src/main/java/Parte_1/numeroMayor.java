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
public class numeroMayor {
    
    double A, B;
    
    public String calcularMayor(){
        if (A>B){
            return (A + " es mayor que " + B);
        }else if (A<B){
            return (A + " es menor que " + B);
        }
        return (A + " es igual a " + B);
    }

    public numeroMayor(Double A, Double B) {
        this.A = A;
        this.B = B;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double A) {
        this.A = A;
    }

    public Double getB() {
        return B;
    }

    public void setB(Double B) {
        this.B = B;
    }
    
    
}
