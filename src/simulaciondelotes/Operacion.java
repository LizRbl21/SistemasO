/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;

/**
 *
 * @author roble
 */
public class Operacion {
    public Operacion(double Num1, double Num2, String Operador){
        this.num1 = Num1;
        this.num2 = Num2;
        this.resultado = 0.0;
        this.operador = Operador;
    }
    
    public double getNum1(){
        return this.num1;
    }
    
    public double getNum2(){
        return this.num2;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    public void setResultado(double Resultado){
        this.resultado = Resultado;
    }
    
    public String getOperacion(){
        return this.operador;
    }
    
    double num1;
    double num2;
    double resultado;
    String operador;
}
