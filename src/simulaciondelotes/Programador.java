/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;

/**
 *
 * @author roble
 */
public class Programador {
    
    public Programador(){
        this.id = autoIncrementoId++;
        this.nombre  = null;
        this.operacion = null;
        this.TME = 0;
    }
    
    public String getOperacion(int numOperacion){
        String simbolo = null;
        switch(numOperacion){
            case 1 -> simbolo = "+";
            case 2 -> simbolo = "-";
            case 3 -> simbolo = "*";
            case 4 -> simbolo = "/";
        }
        return simbolo;
    };
    
    public void generarProgramador(){
        String arregloNombres[] = {"Juan", "Carolina", "Elizabeth", "Alejandra", "Diego", 
        "Hector", "Samantha", "Emiliano", "Carlos", "Jose", "Ricardo", "Martha"};
        int valorNombre = (int)(Math.random()*11)+1;
        int valorOperacion = (int)(Math.random()*3)+1;
        double num1 = (int)(Math.random()*9)+1;
        double num2 = (int)(Math.random()*9)+1;
        TME = (int)(Math.random()*8)+5;
        nombre = arregloNombres[valorNombre];
        operacion = new Operacion(num1, num2, getOperacion(valorOperacion));
        //operacion = String.valueOf(num1)+" "+getOperacion(valorOperacion)+" "+String.valueOf(num2);
    };
    
    public void showProgramador(){
        Operacion progOperacion =  this.operacion;
        System.out.println(this.id + " - " + this.nombre);
        System.out.println("Operacion: " + progOperacion.getNum1() + progOperacion.getOperacion() + progOperacion.getNum2());
        System.out.println("TME: " + this.TME);
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public Operacion getOperacion(){
        return this.operacion;
    }
    
    public int getTME(){
        return this.TME;
    }
    
    public void decrementarTME(){
        TME--;
    }
    
    private static int autoIncrementoId = 1;
    private int id;
    private String nombre;
    private Operacion operacion;
    private int TME;
}
