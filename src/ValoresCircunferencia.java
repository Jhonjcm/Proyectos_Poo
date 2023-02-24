import java.util.*;
public class ValoresCircunferencia {
    public static  void main (String[] args) {
        double radioCircunferencia, areaCircunferecia, longitudCircunferencia;

        System.out.println("Ingrese el radio de la circunferencia: ");
        Scanner radioScanner = new Scanner(System.in);
        radioCircunferencia = radioScanner.nextDouble();

        longitudCircunferencia = 2 * radioCircunferencia * Math.PI;
        areaCircunferecia = Math.PI * Math.pow(radioCircunferencia, 2);

/*         System.out.println("El area del circulo es: " + areaCircunferecia);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia); */

        
    }
    
}
