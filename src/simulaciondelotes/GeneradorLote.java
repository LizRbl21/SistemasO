/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;


/**
 *
 * @author roble
 */
public class GeneradorLote { 
    
    public void generarProceso(int numProcesos) {
        int contadorIndex = 0;

        for (int i = 0; i < numProcesos; i++) {
            Programador newProgramador = new Programador();
            newProgramador.generarProgramador();
            listaProgramadores.agregar(newProgramador);
            realizarOperacion(newProgramador);
        }

        int programadoresRestantes = listaProgramadores.getTamanio();
        int loteIndex = 1;

        while (programadoresRestantes > 0) {
            int programadoresEnLote = Math.min(5, programadoresRestantes);
            Lista tempLote = new Lista();

            for (int i = 0; i < programadoresEnLote; i++) {
                if (contadorIndex < listaProgramadores.getTamanio()) {
                    Programador tempProgramador = (Programador) listaProgramadores.getObjeto(contadorIndex);
                    tempLote.agregar(tempProgramador);
                    contadorIndex++;
                    programadoresRestantes--;
                }
            }

            listaLotes.agregar(tempLote);
            loteIndex++;
        }
        
        for (int x = 0; x < listaLotes.getTamanio(); x++) {
            Lista tempLote = (Lista) listaLotes.getObjeto(x);
            System.out.println("---- Lote " + (x + 1) + " ----");
            tempLote.showLista();
        }
    }
    
    public void realizarOperacion(Programador tempProgramador){
        
        double Resultado=0;
        Operacion tempOperacion = tempProgramador.getOperacion();
        String operadorTemp = tempOperacion.getOperacion();
        double num1Temp = tempOperacion.getNum1();
        double num2Temp = tempOperacion.getNum2();
        switch(operadorTemp){
            case "+" -> Resultado = num1Temp + num2Temp;
            case "-" -> Resultado = num1Temp - num2Temp;
            case "*" -> Resultado = num1Temp * num2Temp;
            case "/" -> {
                    if(num2Temp!=0){
                        Resultado = num1Temp / num2Temp;
                    }else{
                        Resultado = 0.0;
                    }
                }  
         }
        tempOperacion.setResultado(Resultado);
    }
    
    public int getTamanioListProgramadores(){
        return listaProgramadores.getTamanio();
    }
    
    public int getTamanioListLotes(){
        return listaLotes.getTamanio();
    }
    
    public Lista getListaLotes(){
        return this.listaLotes;
    }
    
    public Lista getLista(){
        return this.listaProgramadores;
    }
    
    private Lista listaLotes = new Lista();
    private Lista listaProgramadores = new Lista();
 
}
