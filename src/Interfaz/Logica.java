


package Interfaz;


public class Logica {
  OperacionesCola EjecucionesColas = new OperacionesCola();
  OperacionesPila EjecucionesPilas= new OperacionesPila();
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
    public void montarPersonas (){
       
      
       InicializarPersonas();
       MontarPasajero(0,2);
       
    }
    public int ContarPersonas(int cuidad){ 
        return EjecucionesColas.ContarPersonasFila(cuidad); 
    }
     public int ContarPilas(int Cuidad){
        return EjecucionesPilas.ContarPersonasPilas(Cuidad);
    }
     public void MontarPasajero(int UbicacionPasajero, int BoletoPasajero){
       System.out.println("UbicacionPasajero"+UbicacionPasajero);
       System.out.println("UbicacionBoletoPasajero"+BoletoPasajero);
         int CantidadPasajeros= EjecucionesColas.ContarPasajeros(UbicacionPasajero, BoletoPasajero);
         BajarPersonasDelTren(CantidadPasajeros,BoletoPasajero);
       System.out.println("Pasajeros en Montar"+CantidadPasajeros);
        while(CantidadPasajeros>0){//4
        EjecucionesColas.BorrarPasajero(UbicacionPasajero,BoletoPasajero);//4
       CantidadPasajeros--;
        }  
     }
public void BajarPersonasDelTren(int NumeroDeTrenABajar,int BoletoPasajero){
       
       System.out.println("PasajerosQueBajan"+NumeroDeTrenABajar);
       while(NumeroDeTrenABajar>0){
           EjecucionesPilas.insertarInicio(BoletoPasajero);
           NumeroDeTrenABajar--;
       }
       
       
}

}
