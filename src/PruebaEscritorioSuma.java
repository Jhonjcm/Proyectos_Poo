
public class PruebaEscritorioSuma {
    public static void main(String[] args) {

        double SUMA, X, Y;
        SUMA = 0;
        X = 20;
        SUMA = SUMA +X;
        Y = 40;
        X = X+ Math.pow(Y,2);
        SUMA = SUMA + (X/Y);
        System.out.println("EL VALOR DE LA SUMA ES: "+SUMA);
    }
    
}


/* Inicio
	SUMA=0
	X=20
	SUMA=SUMA+X			# El valor de SUMA queda en 20
	Y=40
	X=X+Y**2			# El valor de X queda en 1620
	SUMA= SUMA+X/Y			# El valor de SUMA queda en 60.5

	ESCRIBA: "EL VALOR DE LA SUMA ES:", SUMA
FIN_INICIO
 */