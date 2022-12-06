
package Interfaz;


public class Logica {
  OperacionesCola EjecucionesColas = new OperacionesCola();
  OperacionesTren EjecucionesTrenes = new OperacionesTren();
  OperacionesPila EjecucionesPilas= new OperacionesPila();
  
  /*
    public int AgregarPersonas(int lugar) {

        int personas15=15;
        int Maximo=4;
        int Minimo=0;
        int rango = Maximo - Minimo + 1;


   
            for (int i = 0; i < personas15; i++) {

                  int posibilidad =(int) (Math.random() * rango)+Minimo;

                EjecucionesColas.insertarFinal(lugar, posibilidad);     
            }
            return personas15;
        }
*/
     public void InicializarPersonas() {

        int personas15=15;
        int Maximo=4;
        int Minimo=0;
        int rango = Maximo - Minimo + 1;


            for(int LugarDePersonas=0; LugarDePersonas<4;LugarDePersonas++){
            for (int i = 0; i < personas15; i++) {

                int posibilidad =(int) (Math.random() * rango)+Minimo;
                EjecucionesColas.insertarFinal(LugarDePersonas, posibilidad);     
            }
            }
     }
     public void ImprimirEstado(){
        
    }
     

       

     
     
   
    
    public void montarPersonas (){
        
        //LLama a la terminal y se anaden 15 personas a cada cola
        InicializarPersonas();
        IniciarTrenes();
        EjecucionesTrenes.randomDestinoTren();//2
        //2
        EjecucionesTrenes.getDestinoTrenes(0);
        MontarPasajero(0,2);
        TrasladarTren(0);
       BajarPersonasDelTren(0);
           
    }
   
   
    public int ContarPersonas(int cuidad){ 
        return EjecucionesColas.ContarPersonasFila(cuidad); 
    }
    
    public int ContarTrenes(int Cuidad){
        return EjecucionesTrenes.ContarPersonasTren(Cuidad);
    }
     public int ContarPilas(int Cuidad){
        return EjecucionesPilas.ContarPersonasPilas(Cuidad);
    }
    
    public void IniciarTrenes(){
     
        for(int NumeroDeTrenes=0; NumeroDeTrenes<10;NumeroDeTrenes++){
        EjecucionesTrenes.insertarInicio(0,NumeroDeTrenes,0);
        }
    
    }
    
     public int MontarPasajero(int UbicacionPasajero, int BoletoPasajero){
       System.out.println("UbicacionPasajero"+UbicacionPasajero);
       System.out.println("UbicacionBoletoPasajero"+BoletoPasajero);
         int CantidadPasajeros= EjecucionesColas.ContarPasajeros(UbicacionPasajero, BoletoPasajero);
       System.out.println("Pasajeros en Montar"+CantidadPasajeros);
       int GuardarCantidadPasajeros=CantidadPasajeros;
        while(CantidadPasajeros>0){//4
         
            EjecucionesTrenes.insertarInicio(BoletoPasajero,0,0);//4
        EjecucionesColas.BorrarPasajero(UbicacionPasajero,BoletoPasajero);//4
       CantidadPasajeros--;
        }
        
       return GuardarCantidadPasajeros; 
       
    }public void TrasladarTren(int NumeroDeTren){
        EjecucionesTrenes.TrasladarTren(NumeroDeTren);
    }

public void BajarPersonasDelTren(int NumeroDeTrenABajar){
       int BajarPasajeros;
       BajarPasajeros=MontarPasajero(0,2);
       System.out.println("PasajerosQueBajan"+BajarPasajeros);
       while(BajarPasajeros>0){
           EjecucionesTrenes.borrarInicio(NumeroDeTrenABajar); 
           EjecucionesPilas.insertarInicio(2);
       }
       
       
}

}
