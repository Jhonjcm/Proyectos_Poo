
package Parte_1;


public class salarioMensual {
    String nom;
    double salHora, horasT;

    public boolean infoEmpleado(){
        if (getHorasT()*getSalHora() > 450000){
            return true;
        } else{
            return false;
        }
    }
    
    public salarioMensual(String nom, double salHora, double horasT) {
        this.nom = nom;
        this.salHora = salHora;
        this.horasT = horasT;
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }

    public double getHorasT() {
        return horasT;
    }

    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }
    
    
}
