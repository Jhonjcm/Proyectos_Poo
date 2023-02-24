
public class SalarioEmpleado {
    public static void main (String[] args) {
        double salarioBruto, salarioNeto, retencionFuente;

        salarioBruto = 5000*8*30;
        salarioNeto = salarioBruto-salarioBruto*0.125;
        retencionFuente = salarioBruto - salarioNeto;

        System.out.println("El salario bruto del trabajador es: " + salarioBruto);
        System.out.println("El salario neto del trabajador es: " + salarioNeto);
        System.out.println("El valor de la retención en la fuente, del trabajador es: " + retencionFuente);
    }
}
