package barcos;

public class Yate extends Barco{

    //ATRIBUTOS
    private int numCamarotes;


    /// Constructor
    public Yate(String matricula, int eslora, int anoFabricacion, String motor, int numCamarotes) {
        super(matricula, eslora, anoFabricacion, motor);
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "Numero de camarotes=" + numCamarotes +
                ", Matricula='" + matricula + '\'' +
                ", Ano de fabricacion=" + anoFabricacion +
                ", Motor='" + motor + '\'' +
                '}';
    }
}
