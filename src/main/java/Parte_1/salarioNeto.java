/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte_1;

/**
 *
 * @author jhonj
 */
public class salarioNeto {
    int codigo;
    String nombres;
    double numHTrabajadas;
    double valorHora;
    double retencionFuente;
    
    public double calcularSalBruto (){
        return getNumHTrabajadas() * getValorHora();
    }
    public double calcularSalNeto(){
        //return (getNumHTrabajadas() * getValorHora())- (getNumHTrabajadas() * getValorHora()*getRetencionFuente());
        return calcularSalBruto()-(calcularSalBruto()*(getRetencionFuente()/100));
    }
    

    public salarioNeto(int codigo, String nombres, double numHTrabajadas, double valorHora, double retencionFuente) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.numHTrabajadas = numHTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getNumHTrabajadas() {
        return numHTrabajadas;
    }

    public void setNumHTrabajadas(double numHTrabajadas) {
        this.numHTrabajadas = numHTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(double retencionFuente) {
        this.retencionFuente = retencionFuente;
    }
    
    
}
