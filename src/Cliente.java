public class Cliente {

    //ATRIBUTOS
     private String nombre;
     private int DNI;
     private short edad;


    /// CONSTRUCTOR
    public Cliente(String nombre, int DNI, short edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }


    /// ToString
    @Override
    public String toString() {
        return  "\n"  +
                "Nombre del cliente = " + nombre + "\n" +
                "DNI = " + DNI + "\n" +
                "Edad = " + edad +  "\n";
    }
}
