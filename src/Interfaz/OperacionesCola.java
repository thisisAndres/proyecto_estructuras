package Interfaz;

public class OperacionesCola {
    
  
     NodoCola FilasPorCuidad[] = new NodoCola[5];
     
    OperacionesCola(){
         
         for(int i = 0; i < FilasPorCuidad.length;FilasPorCuidad[i] = null, i++); 
    }

    public void insertarFinal (int Cuidad,int destino) {
        
        NodoCola nuevo = new NodoCola();
        nuevo.destino = destino;
        nuevo.siguiente = null;
        if (FilasPorCuidad[Cuidad] == null)
            FilasPorCuidad[Cuidad] = nuevo;
        else {   
            NodoCola aux = FilasPorCuidad[Cuidad];
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = nuevo;
            
        }  
    }
    public void ImprimirEstado(){
        int Imprimir=4;
        while(Imprimir>0){
            System.out.println("Fila"+FilasPorCuidad[Imprimir]);
          
        }
    }
       public int ContarPersonasFila(int i) {
           int contador=0;  
            for(NodoCola aux = FilasPorCuidad[i]; aux != null; aux = aux.siguiente){
              contador++;
                System.out.println("Fila"+contador);
                      }
        
      return contador;     
    }
       
    public void BorrarPasajero (int UbicacionPasajero,int BoletoDestinoPasajero) {
    
       NodoCola Inicio;
       NodoCola Fin=null;
       Inicio=FilasPorCuidad[UbicacionPasajero];
        while(Inicio!=null){
            if(Inicio.destino==BoletoDestinoPasajero){
                if(Inicio==FilasPorCuidad[UbicacionPasajero]){
                    FilasPorCuidad[UbicacionPasajero]=FilasPorCuidad[UbicacionPasajero].siguiente; 
                }else{
                    Fin.siguiente=Inicio.siguiente;  
                }
            }
            Fin=Inicio;
            Inicio=Inicio.siguiente;
        }
    }
    
 public int ContarPasajeros(int UbicacionPasajero,int DestinoPasajero){
       int contarPasajeros=0;
     if (FilasPorCuidad[UbicacionPasajero] != null) {
            
            NodoCola aux = FilasPorCuidad[UbicacionPasajero];
            
            while (aux.siguiente != null){
                if(aux.destino==DestinoPasajero){
                    contarPasajeros++;
                    System.out.println("FuncionDecontar"+contarPasajeros);
                }
                aux = aux.siguiente; 
            }
                  
        }
     return contarPasajeros;
 }
    public int getDestinoCola(int ciudad){
        return FilasPorCuidad[ciudad].destino;
    }
}
