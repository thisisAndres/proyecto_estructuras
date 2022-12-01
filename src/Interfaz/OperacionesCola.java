public class OperacionesCola {
    
  
     NodoCola Colas[] = new NodoCola[6];
    
    OperacionesCola(){
        
         for(int i = 0; i < Colas.length;Colas[i] = null, i++); 
    }

    public void insertarFinal (int Cuidad,int destino) {
        NodoCola nuevo = new NodoCola();
        nuevo.persona = destino;
        nuevo.siguiente = null;
        if (Colas[Cuidad] == null)
            Colas[Cuidad] = nuevo;
        else {   
            NodoCola aux = Colas[Cuidad];
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = nuevo;
            
        }  
    }
    
    public void borrarInicio (int Inicio) {

        if (Colas[Inicio] != null)
            Colas[Inicio] = Colas[Inicio].siguiente;
        
    }
       public void imprimir() {
        for(int i = 1; i < Colas.length; i++) {
            switch (i) {
                case 1 -> System.out.println("Roma");
                case 2 -> System.out.println("Naples");
                case 3 -> System.out.println("Milan ");
                case 4 -> System.out.println("Venicia");
                case 5 -> System.out.println("Florencia");
                default -> {
                }
            }
           
            for(NodoCola aux = Colas[i]; aux != null; aux = aux.siguiente)
                System.out.println(aux.persona);
        }
    }
    
    //contarPersonas devuelve un dato tipo int el cual es el numero de 
    //personas que hay en la fila
    /*
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
    codigo en mantenimiento jajaja
    */
    
}
