import barcos.Barco;
import barcos.EmbarcacionDeportiva;
import barcos.Yate;
import barcos.Velero;

public class Main {
    public static void main(String[] args) {

        //Objetos
      Barco velero1 = new Velero("1234", 42, 2000, "Electrico", 2);
      Barco yate1 = new Yate("5678", 45, 2005, "Twin V8", 4);
      Barco deportivo1 = new EmbarcacionDeportiva("91011", 23, 2010, "V8", 300);

      Alquiler alquilerVelero1 = new Alquiler(velero1, 5);
      Alquiler alquilerYate1 = new Alquiler(yate1, 5);
      Alquiler alquilerDeprotivo1 = new Alquiler(deportivo1, 5);

      Cliente tomas = new Cliente("Tomas", 189564309, (short) 29);
      Cliente juan = new Cliente("Juan", 192223833, (short) 32);
      Cliente maria = new Cliente("Maria", 178283737, (short) 27);

        //Mostrar
        System.out.println();
        System.out.println("Barcos:");
        System.out.println("-----------------");
        System.out.println("Caracteristicas de velero1: " + velero1);
        System.out.println("Caracteristicas de yate1: " + yate1);
        System.out.println("Caracteristicas de deportivo1: " + deportivo1);


        System.out.println();
        System.out.println("Alquileres:");
        System.out.println("-----------------");
        System.out.println("Costo alquiler velero1: $" + alquilerVelero1.calcAlquier());
        System.out.println("Costo alquiler yate1: $" + alquilerYate1.calcAlquier());
        System.out.println("Costo alquiler deportivo1: $" + alquilerDeprotivo1.calcAlquier());

        System.out.println();
        System.out.println("Cliente:");
        System.out.println("-----------------");
        System.out.println("Caracteristicas de Tomas: " + tomas);
        System.out.println("Caracteristicas de Juan: " + juan);
        System.out.println("Caracteristicas de Maria: " + maria);
















    }
}