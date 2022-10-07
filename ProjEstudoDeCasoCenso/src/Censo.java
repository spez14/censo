/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor
 */
public class Censo {
    public int numPessoasResi;
    public int totNumPessoas;
    public int numFamilias;
    public int rendaFamiliar;
    public int totRendaFamiliar;
    public int rendaMediaFamiliar;
    public double totCasas;
    public double casasAlugadas;
    public double casasProprias;
    public double percCasasAlugadas;
    public double percCasasProprias;
     
    
    public int CalcularMediaRenda() {
        this.rendaMediaFamiliar = totRendaFamiliar / numFamilias;
        return rendaMediaFamiliar;
        
    }
    
    public double CalcularPercentualCasasAlugadas() {
        double totCasas = this.totCasas;
        double casasAlugadas= this.casasAlugadas;
        this.percCasasAlugadas = ( casasAlugadas / totCasas)*100;
           
        return percCasasAlugadas;    
    }
    
    public double CalcularPercentualCasasProprias() {
        double totCasas = this.totCasas;
        double casasProprias = this.casasProprias;
        this.percCasasProprias = ( casasProprias / totCasas)*100;
                    
        return percCasasAlugadas;       
    }
}
