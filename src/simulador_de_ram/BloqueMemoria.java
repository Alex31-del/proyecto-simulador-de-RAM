package simulador_de_ram;

/**
 *
 * @author CRISTHIAN
 */
public class BloqueMemoria {
    
    private int inicio;
    private int tamano;
    private boolean ocupado;
    private Proceso proceso;

    public BloqueMemoria(int inicio, int tamano) {
        this.inicio = inicio;
        this.tamano = tamano;
        ocupado = false;
        proceso = null;
    }
    
    
            
}
