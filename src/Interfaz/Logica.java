
package Interfaz;


public class Logica {
OperacionesCola Colas=new OperacionesCola();

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
 
      
}public void ImprimirPersonas(){
    Colas.imprimir();
}
     
}

