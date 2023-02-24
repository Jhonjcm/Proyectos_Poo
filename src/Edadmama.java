import java.util.Scanner;
public class Edadmama {
    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama;

        System.out.println("Edad de Juan: ");
        Scanner entradajuan = new Scanner(System.in);
        edjuan=entradajuan.nextInt();

        edalber = 2 * (edjuan/3);
        edana = 4 * (edjuan/3);
        edmama = edjuan+edalber+edana;

        System.out.println("La edad de Juan es: "+ edjuan);
        System.out.println("La edad de Alber es: "+ edalber);
        System.out.println("La edad de Ana es: "+ edana);
        System.out.println("La edad de mamá es: "+ edmama);




    }
}
