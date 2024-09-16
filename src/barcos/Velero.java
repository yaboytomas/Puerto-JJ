package barcos;

public class Velero extends Barco{

    //ATRIBUTOS
    private int numMastiles;


    /// Constructor
    public Velero(String matricula, int eslora, int anoFabricacion, String motor, int numMastiles) {
        super(matricula, eslora, anoFabricacion, motor);
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "Numero de mastiles=" + numMastiles +
                ", Matricula='" + matricula + '\'' +
                ", Ano de fabricacion=" + anoFabricacion +
                ", Motor='" + motor + '\'' +
                '}';
    }
}
