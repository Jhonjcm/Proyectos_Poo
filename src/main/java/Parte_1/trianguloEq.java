package Parte_1;


public class trianguloEq {
    double lado;
    
    public double calcularPerimetro(){
        return getLado()*3;
    }
    public double calcularAltura(){
        return (Math.sqrt(3) * getLado())/2;
    }
    public double calcularArea(){
        return ((getLado()/2) * calcularAltura())/2;
    }

    public trianguloEq(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}

