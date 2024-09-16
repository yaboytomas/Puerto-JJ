package barcos;

public abstract class Barco {

    //ATRIBUTOS
    protected String matricula;
    private int eslora;
    protected int anoFabricacion;
    protected String motor;


    /// Constructor
    public Barco(String matricula, int eslora, int anoFabricacion, String motor) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.motor = motor;
    }

    /// Modulo
    public int modulo(){
        return 10 * eslora;
    }
}
