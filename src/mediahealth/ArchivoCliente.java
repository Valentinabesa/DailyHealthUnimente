/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediahealth;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArchivoCliente {
private ArrayList<mediahealth.Cliente> Clientes = new ArrayList();
    private Medico1 datosClientes;
 

    public ArchivoCliente(Medico1 data) {
        datosClientes = data;

    }
  
  public void cliente(){
    
  }
  public void escribir(ArrayList clientes) throws FileNotFoundException, IOException{
 

 
 
        File f; 
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

       
        try {

            f = new File("./Archivo1/ArchivoCliente.txt");
            w = new FileWriter(f,Boolean.TRUE);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            wr.write("Clientes: " + Clientes);
            wr.println();
            wr.close();

        } catch (Exception e) {

            System.err.println("Hubo un error" + e);
        }

        FileOutputStream out = new FileOutputStream(ruta);
		
		for(int i=0;i<Clientes.size();i++){
			out.write((Clientes.get(i).toString()+"\n").getBytes());
		}

    }
  
    private String ruta;
    public  ArchivoCliente() {
        this.ruta = "./Archivo1/ArchivoClientes.txt";
       // this.verificaArchivo();
   }
}
/**
 *
 * @author ValenBeSa
 */

