
package Parte_1;

public class matricula {
    
    double NI, PAT, PAGMAT;
    int EST;
    String NOM;

    public double calcularMatricula(){
        
        if ((PAT > 2000000) && (EST > 3)) {
            PAGMAT += PAT*0.03;
        }
        return PAGMAT;
    }
    
    public matricula(double NI, double PAT, double PAGMAT, int EST, String NOM) {
        this.NI = NI;
        this.PAT = PAT;
        this.PAGMAT = PAGMAT;
        this.EST = EST;
        this.NOM = NOM;
    }

    public double getNI() {
        return NI;
    }

    public void setNI(double NI) {
        this.NI = NI;
    }

    public double getPAT() {
        return PAT;
    }

    public void setPAT(double PAT) {
        this.PAT = PAT;
    }

    public double getPAGMAT() {
        return PAGMAT;
    }

    public void setPAGMAT(double PAGMAT) {
        this.PAGMAT = PAGMAT;
    }

    public int getEST() {
        return EST;
    }

    public void setEST(int EST) {
        this.EST = EST;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }
    
    
    
}
