import java.util.*;
public class CuadaradoCubo {
    public static void main(String[] args){
        double numero;

        System.out.println("Ingrese un número: ");
        Scanner numScanner = new Scanner(System.in);
        numero = numScanner.nextDouble();

        System.out.println("El cuadrado de " + numero + "es " + (numero*numero));
        System.out.println("El cubo de " + numero + "es " + (numero*numero*numero));

    }
     
}
