
package Interfaz;


//Codigo Andres
public class OperacionesPila {
    
    NodoPila Pilas[] = new NodoPila[6];
    
    OperacionesPila(){
        
        for(int i = 0; i < Pilas.length;Pilas[i] = null, i++);   
    }
    
//Creo que para trabajar mejor en esto podemos usar la matriz debido a que cada pais podria tener su numero de cuidad
    /*
   NCuidad =1    Roma
    NCuidad= 2  Naples
     NCuidad=3   Milan
     NCuidad=4   Venicia
     NCuidad=5   Florencia
    es decir cada vez que un tren vaya a roma guardamos las personas en Roma en int 1
    */
    
    
    public void insertarInicio(int NCuidad) {
        
        NodoPila nuevo = new NodoPila();
        nuevo.cuidad = NCuidad;
        nuevo.siguiente = null;
        
        //Evalua si la pila es Null o no, si es null solo le 
        //anade el valor de nuevo, si no es null se lo anade
        // al siguiente espacion en memoria
        if (Pilas[NCuidad] == null)
            Pilas[NCuidad] = nuevo;
        else {
            nuevo.siguiente = Pilas[NCuidad];
            Pilas[NCuidad] = nuevo;
        }
        
    }
    //Implementacion de vector de pilas tomada de la ultima clase que tuvimos de estructura de datos
    public void borrarInicio (int Ncuidad) {
        
        //Checkea si la 
        if (Pilas[Ncuidad] != null)
                Pilas[Ncuidad] = Pilas[Ncuidad].siguiente;
        
    }
   public void imprimir() {//Por el momento esto esta aqui por si quieren hacer pruebas con respecto a la Pila sin embargo para entrega final no lo ocupamos
        for(int i = 1; i < Pilas.length; i++) {
            switch (i) {
                case 1 -> System.out.println("Roma");
                case 2 -> System.out.println("Naples");
                case 3 -> System.out.println("Milan ");
                case 4 -> System.out.println("Venicia");
                case 5 -> System.out.println("Florencia");
                default -> {
                }
            }
           
            for(NodoPila aux = Pilas[i]; aux != null; aux = aux.siguiente)
                System.out.println(aux.cuidad);
        }
    }
    
    
}
