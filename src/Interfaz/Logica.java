
package Interfaz;


public class Logica {
    //Instanciamineto de Pilas
    //Una PILA por cada ciudad
    private OperacionesCola pilaRoma = new OperacionesCola();
    private OperacionesCola pilaNaples = new OperacionesCola();
    private OperacionesCola pilaMilan = new OperacionesCola();
    private OperacionesCola pilaVenecia = new OperacionesCola();
    private OperacionesCola pilaFlorencia = new OperacionesCola();

    //Instanciamiento de Colas
    //Una COLA por cada ciudad
    private OperacionesPila colaRoma = new OperacionesPila();
    private OperacionesPila colaNaples = new OperacionesPila();
    private OperacionesPila colaMilan = new OperacionesPila();
    private OperacionesPila colaVenecia = new OperacionesPila();
    private OperacionesPila colaFlorencia = new OperacionesPila();
    
    
    //Instanciamiento de Ciuades
    private Ciudades[] ciudad = {
        new Ciudades("Roma"),
        new Ciudades("Naples"),
        new Ciudades("Milan"),
        new Ciudades("Venecia"),
        new Ciudades("Florencia"),
    };
            
}
