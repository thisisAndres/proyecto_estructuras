
package Interfaz;


public class Logica {
  OperacionesCola Colas = new OperacionesCola();
  OperacionesTren Trenes = new OperacionesTren();
  
    public void AgregarPersonas() {

        int personas15=15;
        int Maximo=5;
        int Minimo=1;
        int rango = Maximo - Minimo + 1;


       for(int j=0; j<6;j++){
            for (int i = 0; i < personas15; i++) {

                  int posibilidad =(int) (Math.random() * rango)+Minimo;

                Colas.insertarFinal(j, posibilidad);     
            }
        }
       

     }
   
    
    public void montarPersonas (){
        
        //LLema a la terminal y se anaden 15 personas a cada cola
        AgregarPersonas();
        
        //Setea los destinos proximos de todos los trenes
        Trenes.randomDestinoTren();
        
         /*
        El for recorre cada uno de los trenes, comparando el
        destino de la persona si es true se procende a anadir
        esa persona al tren y eliminarla de la cola
         */
         
        for (int i = 0; i < 10; i++) {
            Trenes.getDestino(i);
            
            if(Trenes.getDestino(i) == Colas.getDestino(i)){
                
                Trenes.insertarInicio(Colas.getDestino(i));
                Colas.borrarInicio(i);
            }    
        }   
        
        
    }
   
       
    public void ImprimirPersonas(){
        Colas.imprimir();
    }
     
}

