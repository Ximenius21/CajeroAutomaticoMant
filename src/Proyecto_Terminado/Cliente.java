package Proyecto_Terminado;

import java.util.ArrayList;

public class Cliente {

	private String NombreCte;
	private String Tipo;
	private String NumCuenta;
	private int Nip;
	private double Saldo;
	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	 
	
	public Cliente(String NombreCte, String Tipo, String NumCuenta, int Nip, double Saldo) {
		this.NombreCte = NombreCte;
		this.Tipo = Tipo;
		this.NumCuenta = NumCuenta;
		this.Nip = Nip;	
		this.Saldo = Saldo;
		listaClientes.add(this);
		
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

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNumCuenta() {
		return NumCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		NumCuenta = numCuenta;
	}

	public int getNip() {
		return Nip;
	}

	public void setNip(int nip) {
		Nip = nip;
	}
	
	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
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
