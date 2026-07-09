/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_de_ram;
import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {
    private MemoriaRAM  memoria;
    private PanelProcesos panelProcesos;
    

    public VentanaPrincipal() {
        
        memoria = new MemoriaRAM(1024);
        panelProcesos = new PanelProcesos(memoria);
        
        setTitle("Simulador de Memoria RAM");

        setLayout(new BorderLayout());

        add(panelProcesos, BorderLayout.WEST);
        

        setSize(1000,600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
            
            
}
