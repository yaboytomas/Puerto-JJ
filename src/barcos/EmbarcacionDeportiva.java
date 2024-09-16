package barcos;

public class EmbarcacionDeportiva extends Barco {

    //ATRIBUTOS
    private int potenciaCV;


    /// Constructor
    public EmbarcacionDeportiva(String matricula, int eslora, int anoFabricacion, String motor, int potenciaCV) {
        super(matricula, eslora, anoFabricacion, motor);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "EmbarcacionDeportiva{" +
                "Potencia en CV=" + potenciaCV +
                ", Matricula='" + matricula + '\'' +
                ", Ano de fabricacion=" + anoFabricacion +
                ", Motor='" + motor + '\'' +
                '}';
    }
}
