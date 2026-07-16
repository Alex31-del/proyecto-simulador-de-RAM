/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_de_ram;

import java.io.*;
public class ArchivoMemoria {
    
    public static void guardar(MemoriaRAM memoria, File archivo){
        throws IOException{
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

        bw.write(memoria.getMemoriaTotal() + "");
        bw.newLine();

        for(BloqueMemoria b : memoria.getBloques()){

            if(b.isOcupado()){

                bw.write(
                        b.getInicio() + "," +
                        b.getTamano() + "," +
                        b.getProceso().getNombre()
                );

            }else{

                bw.write(
                        b.getInicio() + "," +
                        b.getTamano() + ",LIBRE"
                );
         }

            bw.newLine();

        }

        bw.close();
        
        }
    }
}
