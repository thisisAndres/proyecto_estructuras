
package Interfaz;


public class Logica {
  OperacionesCola EjecucionesColas = new OperacionesCola();
  OperacionesPila EjecucionesPilas= new OperacionesPila();
  NodoTren TrenesCuidad[] = new NodoTren[10];
     public void IngresarPersonas(int LugarDePersonas) {

        int personas15=15;
        int Maximo=4;
        int Minimo=0;
        int rango = Maximo - Minimo + 1;


           
            for (int i = 0; i < personas15; i++) {

                int posibilidad =(int) (Math.random() * rango)+Minimo;
                EjecucionesColas.insertarFinal(LugarDePersonas, posibilidad);     
            
            }
     } 
    public void EjecutarTrenes (){
        int Trenes10=10;
        int Maximo=4;
        int Minimo=0;
        int rango = Maximo - Minimo + 1;
         for (int i = 0; i < Trenes10; i++) {
        int posibilidadDeDestino =(int) (Math.random() * rango)+Minimo;
        int posibilidadDeCuidadDeOrigen =(int) (Math.random() * rango)+Minimo;
        Tren(i,posibilidadDeCuidadDeOrigen,posibilidadDeDestino);//el primero es el numero del tren, el segundo es la ubicacion del pasajero, el tercero es el boletoDelPasajero  
    }
}
    public int ContarPersonas(int cuidad){ 
        return EjecucionesColas.ContarPersonasFila(cuidad); 
    }
     public int ContarPilas(int Cuidad){
        return EjecucionesPilas.ContarPersonasPilas(Cuidad);
    }
     public void Tren(int NumeroDeTren,int UbicacionPasajero,int BoletoPasajeroTren){
      int CantidadPasajeros= EjecucionesColas.ContarPasajeros(UbicacionPasajero, BoletoPasajeroTren);
      EnviarPasajeros(UbicacionPasajero,BoletoPasajeroTren,CantidadPasajeros);
      NodoTren nuevo = new NodoTren();
      nuevo.PersonasAbordo = CantidadPasajeros;
      nuevo.siguiente = null;
      TrenesCuidad[NumeroDeTren] =nuevo;
      BajarPersonasDelTren(CantidadPasajeros,BoletoPasajeroTren);
      TrenesCuidad[NumeroDeTren]=null;
      IngresarPersonas(BoletoPasajeroTren);
}
     public void EnviarPasajeros(int UbicacionPasajero, int BoletoPasajero,int CantidadPasajeros){
       while(CantidadPasajeros>0){//4
       EjecucionesColas.BorrarPasajero(UbicacionPasajero,BoletoPasajero);//4
       CantidadPasajeros--;
        }  
     }
public void BajarPersonasDelTren(int NumeroDeTrenABajar,int BoletoPasajero){
       while(NumeroDeTrenABajar>0){
           EjecucionesPilas.insertarInicio(BoletoPasajero);
           NumeroDeTrenABajar--;
       }
       
       
}

}

