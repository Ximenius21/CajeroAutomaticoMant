package Proyecto_Terminado;

import java.util.ArrayList;

public class Cliente {
	private int Id;
	private String Direccion;
	private String NombreCte;
	
	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	 
	public Cliente(int Id, String Direccion, String NombreCte) {
		this.Id=Id;
		this.Direccion=Direccion;
		this.NombreCte=NombreCte;
	}
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public String getNombreCte() {
		return NombreCte;
	}

	public void setNombreCte(String nombreCte) {
		NombreCte = nombreCte;
	}

	
	public Cliente obtenerCliente(String nombre) {
		
    	for (Cliente cliente : listaClientes) {
			if (cliente.getNombreCte().equalsIgnoreCase(nombre)){
				return cliente;
			}
		}
    	return null;
    }
	
}
