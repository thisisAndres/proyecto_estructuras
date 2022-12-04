//Esta clase sera el controlador de todo
package Interfaz;


public class OperacionesTren {
      NodoTren Tren[] = new NodoTren[10];

    public OperacionesTren() {
        
           for(int i = 0; i < Tren.length;Tren[i] = null, i++);
           
    }
    
    public void insertarInicio(int NCuidad) {
        
        NodoTren nuevo = new NodoTren();
        
        nuevo.cuidad = NCuidad;
        
          nuevo.siguiente = null;
        if (Tren[NCuidad] == null)
            Tren[NCuidad] = nuevo;
        else {
            nuevo.siguiente =Tren[NCuidad];
            Tren[NCuidad] = nuevo;
        }
        
    }
    
    public void borrarInicio (int Ncuidad) {
        
        
        if (Tren[Ncuidad] != null)
                Tren[Ncuidad] = Tren[Ncuidad].siguiente;
        
    } 
    
    //Esta funcion anade el destino INICIAL aleatoreo a todos los trenes 
    public void randomDestinoTren(){

    int rango = 5;
    int posibilidad;

        for (int i = 0; i < 10; i++) {
            
            posibilidad = (int) (Math.random() * rango + 1);
            
            Tren[i].destino = posibilidad;
            
        }
        
    }
    
    //retonna el destino del tren
    public int getDestino (int ciudad){
        return Tren[ciudad].destino;
    }
    

    


    


    
      
}
