

package Interfaz;


//Codigo Andres
public class OperacionesPila {
    
    NodoPila IndicePilas[] = new NodoPila[5];
   
    OperacionesPila(){
        
        for(int i = 0; i < IndicePilas.length;IndicePilas[i] = null, i++);   
       
    }
    public void insertarInicio(int NCuidad) {
        
        NodoPila nuevo = new NodoPila();
        nuevo.cuidad = NCuidad;
        nuevo.siguiente = null;
        
        //Evalua si la pila es Null o no, si es null solo le 
        //anade el valor de nuevo, si no es null se lo anade
        // al siguiente espacion en memoria
        if (IndicePilas[NCuidad] == null)
            IndicePilas[NCuidad] = nuevo;
        else {
            nuevo.siguiente = IndicePilas[NCuidad];
            IndicePilas[NCuidad] = nuevo;
        }
        
    } 
  public int ContarPersonasPilas(int i) {
           int contador=0;  
            for(NodoPila aux = IndicePilas[i]; aux != null; aux = aux.siguiente){
              contador++;
                      }   
      return contador;     
    }
    
    
}
