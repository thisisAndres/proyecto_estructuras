

package Interfaz;


//Codigo Andres
public class OperacionesPila {
    
    NodoPila IndicePilas[] = new NodoPila[5];
    
    OperacionesPila(){
        
        for(int i = 0; i < IndicePilas.length;IndicePilas[i] = null, i++);   
       
    }
    
//Creo que para trabajar mejor en esto podemos usar la matriz debido a que cada pais podria tener su numero de cuidad
    /*
   NCuidad =0    Roma
    NCuidad= 1  Naples
     NCuidad=2   Milan
     NCuidad=3   Venicia
     NCuidad=4   Florencia
    es decir cada vez que un tren vaya a roma guardamos las personas en Roma en int 1
    */
    
    
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
