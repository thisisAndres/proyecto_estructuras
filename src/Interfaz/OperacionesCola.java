

package Interfaz;


public class OperacionesCola {
    
    private NodoCola Cola = new NodoCola();
    
    OperacionesCola(){
        
        Cola = null;
        
    }

    public void insertarFinal (int Persona) {
        NodoCola nuevo = new NodoCola();
        nuevo.persona = Persona;
        nuevo.siguiente = null;
        if (Cola == null)
            Cola = nuevo;
        else {   
            NodoCola aux = Cola;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = nuevo;
            
        }  
    }
    
    public void borrarInicio () {

        if (Cola != null)
            Cola = Cola.siguiente;
        
    }
    
    //contarPersonas devuelve un dato tipo int el cual es el numero de 
    //personas que hay en la fila
    public int contarPersonas(){
        
        int cuenta = 0;
        
        if (Cola == null)
            return cuenta;
        else{
            
                NodoCola aux = Cola;
                
                //anade 1 cada vez que el siguiente no sea null
                while(aux.siguiente != null)
                    cuenta++;
                
                return cuenta;
            
            }
        
    }
    
}
