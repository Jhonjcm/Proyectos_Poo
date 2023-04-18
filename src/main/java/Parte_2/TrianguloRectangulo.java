
package Parte_2;


public class TrianguloRectangulo {
    int base;
    int altura;


    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    double calcularArea() {
        return (base * altura / 2);
    }

    
    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
    }

    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    
    String determinarTipoTriángulo() {
        String salida = "";
        
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            salida = "Es un triángulo equilátero";
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){    
            salida = "Es un triángulo escaleno";
        } else{
            salida = "Es un triángulo isósceles";
        }
        return salida;
    }

}
