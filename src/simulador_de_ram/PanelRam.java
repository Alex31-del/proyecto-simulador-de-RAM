package simulador_de_ram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author rjosu
 */
public class PanelRam extends JPanel{
    
    private MemoriaRAM memoria;
    
    private final int MARGEN_X = 40;
    private final int MARGEN_Y = 20;

    private final int ANCHO_RAM = 120;
    private final int ALTO_RAM = 500;
    
    public PanelRam(MemoriaRAM memoria){
        this.memoria=memoria;
        repaint();
        
        setPreferredSize(new Dimension(250,550));
        setBackground(Color.WHITE);
    }
    
    public MemoriaRAM getMemoria(){
        return memoria;
    }
    
    public void setMemoria(MemoriaRAM memoria){
        this.memoria=memoria;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if(memoria == null)
        return;
        
        //Ram gráfica
        g.setColor(Color.BLACK);
        g.drawRect(MARGEN_X, MARGEN_Y, ANCHO_RAM, ALTO_RAM);
        
        
    }
}
