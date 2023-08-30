/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;

/**
 *
 * @author roble
 */

public class Lista<T> {
    public Lista(){
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }
    
    public void agregar(T objeto){
        Nodo<T> newObjeto = new Nodo(objeto);
        if(inicio==null){
            inicio = newObjeto;
            fin = newObjeto;
        }else{
            newObjeto.prev = fin;
            fin.sig = newObjeto;
            fin = newObjeto;
        }
        tamanio++;
    }
    
    public void showLista(){
        Nodo temp = inicio;
        while(temp != null){
            Programador tempProgramador = (Programador) temp.objeto;
            tempProgramador.showProgramador();
            temp = temp.sig;
        }
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    public T getObjeto(int posicion){
        Nodo<T> temp = inicio;
        int index = 0;
        
        while(temp != null && index < posicion){
            temp = temp.sig;
            index++;
        }
        
        if(temp != null){
            return temp.objeto;
        }else{
            return null;
        }
    }
    
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tamanio;
    
}
