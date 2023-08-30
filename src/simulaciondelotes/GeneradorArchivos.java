/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author roble
 */
public class GeneradorArchivos {
    public void crearArchivoGenerados(Lista listaLotes){
        try{
            int numLote=0;
            String ruta = "datos.txt";
            
            File file = new File(ruta);
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter archivoDatos = new FileWriter(file);
            BufferedWriter escribir = new BufferedWriter(archivoDatos);
            
            
            for(int i = 0; i<listaLotes.getTamanio(); i++){
                if(i==0 || i%5==0){
                    numLote++;
                    escribir.newLine();
                    String numeroLote ="--- Lote " + numLote + " ---";
                    escribir.write(numeroLote);
                    escribir.newLine();
                    escribir.write("________________________");
                    
                }
                Programador programador = (Programador) listaLotes.getObjeto(i);
                String nombre =programador.getId() + "- " + programador.getNombre();
                String operacionProgramador = programador.getOperacion().getNum1()
                        + " " + programador.getOperacion().getOperacion()
                        + " " + programador.getOperacion().getNum2();
                String TME ="TME: " + programador.getTME();
                
                String texto = nombre + "\n" + operacionProgramador + "\n" + TME;
                
                escribir.newLine();
                escribir.write(texto);

            }
            
            escribir.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void crearArchivoFinalizados(Lista listaLotes){
        try{
            int numLote=0;
            String ruta = "resultados.txt";
            
            File file = new File(ruta);
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter archivoDatos = new FileWriter(file);
            BufferedWriter escribir = new BufferedWriter(archivoDatos);
            
            
            for(int i = 0; i<listaLotes.getTamanio(); i++){
                if(i==0 || i%5==0){
                    numLote++;
                    escribir.newLine();
                    String numeroLote ="--- Lote " + numLote + " ---";
                    escribir.write(numeroLote);
                    escribir.newLine();
                    escribir.write("________________________");
                    
                }
                Programador programador = (Programador) listaLotes.getObjeto(i);
                String nombre = programador.getId() + "- " + programador.getNombre();
                String resultado = "Resultados: " + programador.getOperacion().getResultado();
                
                String texto = nombre + "\n" + resultado;
                
                escribir.newLine();
                escribir.write(texto);
                
            }
            
            escribir.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
