//Esta clase sera el controlador de todo
package Interfaz;


public class OperacionesTren {
      NodoTren IndiceTren[] = new NodoTren[10];
      int DestinoTren;
    public OperacionesTren() {
        
           for(int i = 0; i < IndiceTren.length;IndiceTren[i] = null, i++);
           
           
    }
    
    public void ArrancarDestinoTren(int NTren) {
       
       
    }
    public void insertarInicio(int PersonasEnTren,int NTren,int Ncuidad) {
        //por que se inserta al inicio una vez mas 
        //pasarlos a la pila
        int intento=0;
        NodoTren nuevo = new NodoTren();
        nuevo.PersonasTren = PersonasEnTren; 
        nuevo.cuidadDestino=Ncuidad;
          nuevo.siguiente = null;
        if (IndiceTren[NTren] == null)
            IndiceTren[NTren] = nuevo;
        else {
            nuevo.siguiente =IndiceTren[NTren];
            IndiceTren[NTren] = nuevo;
        }
        System.out.println("Persona en Tren"+PersonasEnTren);
        System.out.println("Persona en Numero de Tren"+NTren);
        System.out.println("Persona en Cuidad"+Ncuidad);
    }
    public void borrarInicio (int NTren) {
        
        
        if (IndiceTren[NTren] != null)
                IndiceTren[NTren] = IndiceTren[NTren].siguiente;
        
    } 
    
    //Esta funcion anade el destino INICIAL aleatoreo a todos los trenes 
    public void randomDestinoTren(){
    int Maximo=4;
    int Minimo=0;
    int rango = Maximo - Minimo + 1;
    int posibilidadDestino;
    int posibilidadCuidad;
      
           
       
        for (int i = 0; i < 10; i++) {
            posibilidadDestino = (int) (Math.random() * rango )+Minimo;
            posibilidadCuidad = (int) (Math.random() * rango)+Minimo;
            IndiceTren[i].cuidadDestino=posibilidadCuidad;
           // IndiceTren[i].PersonasTren=posibilidadDestino;   
        }
       
    }
    
    
    //retonna el destino del tren
    public int getDestinoTrenes(int numeroTren){
        return IndiceTren[numeroTren].cuidadDestino;
    }
    
    public void TrasladarTren(int NumeroTraslado){
       IndiceTren[NumeroTraslado].cuidadDestino=IndiceTren[NumeroTraslado].PersonasTren;
    }

   
    public int ContarPersonasTren(int i) {
           int contador=0;  
            for(NodoTren aux = IndiceTren[i]; aux != null; aux = aux.siguiente){
             
              System.out.println("Personas"+contador);
               contador++;
                      }
        
      return contador-1;     
    }      
}
