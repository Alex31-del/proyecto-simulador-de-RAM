/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_de_ram;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelProcesos extends JPanel{
    
   private JLabel lNombre, lMemoria,  lAlgoritmo;
   private JTextField tNombre, tMemoria;
   private JButton bCrear, bEliminar;
   private JComboBox<String> cAlgoritmo;
   private JTable tProceso;
   private DefaultTableModel modelo;
   private MemoriaRAM memoria;

    public PanelProcesos(MemoriaRAM memoria) {
        
        this.memoria = memoria;
        
        setLayout(new BorderLayout());
        
        JPanel datos = new JPanel(new GridLayout(4,2));
        lNombre = new JLabel("Nombre:");
        tNombre  = new JTextField();
        
        lMemoria = new JLabel("Memoria (MB):");
        tMemoria = new JTextField();
        
        lAlgoritmo = new JLabel("Algoritmo:");
        
        cAlgoritmo =new JComboBox<>();
        cAlgoritmo.addItem("First Fit");
        cAlgoritmo.addItem("Best Fist");
        cAlgoritmo.addItem("Best Fist");
        
        bCrear = new JButton("Crear");
        bEliminar = new JButton("Eliminar");
        
        datos.add(lNombre);
        datos.add(tNombre);
        
        datos.add(lMemoria);
        datos.add(tMemoria);
        
        datos.add(lAlgoritmo);
        datos.add(cAlgoritmo);
        
        datos.add(bCrear);
        datos.add(bEliminar);
       
        add(datos, BorderLayout.NORTH);
        
    }
   
   
   
}
