
package Parte_1;

public class ecuacionG2 {
    double A,B,C;

    
    public double calcularSol(){
        return Math.pow(B, 2)-4*A*C;
    }
    
    public ecuacionG2(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
}
