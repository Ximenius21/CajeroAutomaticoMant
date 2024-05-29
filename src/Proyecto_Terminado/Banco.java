package Proyecto_Terminado;

import java.util.ArrayList;

public class Banco {
	
	private String Nombre;
	private ArrayList<Tarjeta> listaTarjetas;
	
	
	
	public Banco(String Nombre, ArrayList<Tarjeta> lista) {
		this.Nombre=Nombre;
		listaTarjetas = lista;
	}
	
	public String getNombre(){
        return Nombre;
        
    }

    public void setNombre(String Banco){
        this.Nombre = Nombre;
    }
    
    public ArrayList<Tarjeta> getListaTarjetas(){
    	return listaTarjetas;
    }

}
