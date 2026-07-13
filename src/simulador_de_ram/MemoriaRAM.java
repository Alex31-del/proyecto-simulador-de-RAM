package simulador_de_ram;

/**
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
    public void liberarProceso(String nombre) {

        for (BloqueMemoria bloque : bloques) {

            if (bloque.isOcupado()) {

             if (bloque.getProceso().getNombre().equals(nombre)) {

                bloque.liberarProceso();

                fusionarBloques();

                return;
             }

          }

       }

    }
    public void fusionarBloques() {

         for (int i = 0; i < bloques.size() - 1; i++) {

             BloqueMemoria actual = bloques.get(i);
             BloqueMemoria siguiente = bloques.get(i + 1);

                if (!actual.isOcupado() && !siguiente.isOcupado()) {

                     actual.setTamano(actual.getTamano() + siguiente.getTamano());

                     bloques.remove(i + 1);

                     i--;
                }

        }

    }
}
