package Proyecto_Terminado;

import java.util.ArrayList;

public class Banco {
	
	private String Nombre;
	private ArrayList<Cuentas> listaCuentas;
	
	
	
	public Banco(String Nombre, ArrayList<Cuentas> lista) {
		this.Nombre=Nombre;
		listaCuentas = lista;
	}
	
	public String getNombre(){
        return Nombre;
        
    }

    public void setNombre(String Banco){
        this.Nombre = Nombre;
    }
    
    public ArrayList<Cuentas> getListaCuentas(){
    	return listaCuentas;
    }

}
