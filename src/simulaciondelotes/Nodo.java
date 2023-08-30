/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciondelotes;

/**
 *
 * @author roble
 * @param <T>
 */
public class Nodo<T> {
    public Nodo(T Objeto){
        this.objeto = Objeto;
        this.sig = null;
        this.prev = null;
    }
    
    
    public T objeto;
    public Nodo<T> sig;
    public Nodo<T> prev;
}
