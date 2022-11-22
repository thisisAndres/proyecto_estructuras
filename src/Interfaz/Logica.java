
package Interfaz;


public class Logica {
    //Instanciamineto de Pilas
    //Una PILA por cada ciudad
    private OperacionesCola colaRoma = new OperacionesCola();
    private OperacionesCola colaNaples = new OperacionesCola();
    private OperacionesCola colaMilan = new OperacionesCola();
    private OperacionesCola colaVenecia = new OperacionesCola();
    private OperacionesCola colaFlorencia = new OperacionesCola();

    //Instanciamiento de Colas
    //Una COLA por cada ciudad
    private OperacionesPila pilaRoma = new OperacionesPila();
    private OperacionesPila pilaNaples = new OperacionesPila();
    private OperacionesPila pilaMilan = new OperacionesPila();
    private OperacionesPila pilaVenecia = new OperacionesPila();
    private OperacionesPila pilaFlorencia = new OperacionesPila();
    
    
    //Instanciamiento de Ciuades
    private Ciudades[] ciudad = {
        new Ciudades("Roma"),
        new Ciudades("Naples"),
        new Ciudades("Milan"),
        new Ciudades("Venecia"),
        new Ciudades("Florencia"),
    };
            
}
