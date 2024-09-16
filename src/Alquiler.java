import barcos.Barco;

import java.time.LocalDate;

public class Alquiler {

     //ATRIBUTOS
     Cliente cliente;
     Barco barco;
     private LocalDate fechaInicio;
     private LocalDate fechaFin;
     private int dias;
     private int posicionAmarre;
     private final int valorFijo = 1200;

     public Alquiler(Barco barco, int dias) {
          this.barco = barco;
          this.dias = dias;
     }

     /// Constructor
     public Alquiler(int dias) {
          this.dias = dias;
     }


     /// ToString
     @Override
     public String toString() {
          return "Alquiler{" +
                  "Cantidad de dias=" + dias +
                  '}';
     }

     /// Alquiler
     public int calcAlquier() {
          return barco.modulo() * dias * valorFijo;
     }
}
