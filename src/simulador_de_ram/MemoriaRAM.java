package simulador_de_ram;

/**
 *
 * @author CRISTHIAN
 */

import java.util.ArrayList;

public class MemoriaRAM {
    
    private int memoriaTotal;
    private ArrayList<BloqueMemoria> bloques;
    
    public MemoriaRAM(int memoriaTotal){
        
        this.memoriaTotal = memoriaTotal;
        
        bloques = new ArrayList<>();
        
        bloques.add(new BloqueMemoria(0, memoriaTotal));
    }   

    public int getMemoriaTotal() {
        return memoriaTotal;
    }

    public ArrayList<BloqueMemoria> getBloques() {
        return bloques;
    }
    
    public void dividirMemoria(BloqueMemoria bloque, Proceso p){
        
    }
    
    public void firstFit(Proceso p){
        
    }
    
    public void bestFit(Proceso p){
        
    }
    
    public void worstFit(Proceso p){
        
    }
}
