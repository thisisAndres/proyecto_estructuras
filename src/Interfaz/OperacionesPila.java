/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;


//Codigo Andres
public class OperacionesPila {
    
    private NodoPila Pila = new NodoPila();
    
    OperacionesPila(){
        
        Pila = null;
        
    }
    

    public void insertarInicio(int valor) {
        
        NodoPila nuevo = new NodoPila();
        nuevo.tren = valor;
        nuevo.siguiente = null;
        
        //Evalua si la pila es Null o no, si es null solo le 
        //anade el valor de nuevo, si no es null se lo anade
        // al siguiente espacion en memoria
        if (Pila == null)
            Pila = nuevo;
        else {
            nuevo.siguiente = Pila;
            Pila = nuevo;
        }
        
    }
    

    public void borrarInicio () {
        
        //Checkea si la 
        if (Pila != null)
                Pila = Pila.siguiente;
        
    }
    
    
}
