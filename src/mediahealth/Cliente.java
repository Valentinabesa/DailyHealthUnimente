/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediahealth;

/**
 *
 * @author ValenBeSa
 */
public class Cliente {
    
    private String Nombre;
    private String cedula;
    private String diagnostico;
    
    public Cliente() {

    }

    Cliente(String nombre, String cedula, String diagnostico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Cliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


@Override
	public String toString() {
		return cedula + "," + Nombre + "," + diagnostico;
	}


    
        
}