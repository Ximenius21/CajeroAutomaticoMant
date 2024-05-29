package Proyecto_Terminado;

import java.util.ArrayList;

public class Retiro extends Clase_Abstractaa {

	//METODO RETIRAR PARAMETRO CUENTA, TIPO, MONTO
	public Retiro(String idTransaccion, String fecha, String tipo, double monto) {
		super(idTransaccion, fecha, tipo, monto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Transacciones(String cuenta,String cuentaDestino, String tipo, double monto, Banco banco) {
		 Retirar(cuenta, tipo, monto, banco);	
		 
	}

	public void Retirar(String cuenta, String tipo, double monto, Banco banco) {
		
		ArrayList<Cuentas> listaCuenta = banco.getListaCuentas();
		Cuentas cta = ObtenerDatosCuentas(listaCuenta, cuenta, tipo);
		//falta verificar el tipo
		
		
		//Retirar dinero de cuenta
		if(monto <= cta.getSaldo()) {
			cta.setSaldo(cta.getSaldo()-monto);
			System.out.println("====================================");
			System.out.println("=================BBVA===============");
			System.out.println("				Debito				");
			System.out.println("Se relalizo una Consulta el 31/10/2023");
			System.out.println("Retiraste : " + monto);
			System.out.println("Tu saldo actual es: " + cta.getSaldo());
			System.out.println("====================================");
			
		}else {
			System.out.println("=====================");
			System.out.println("Saldo insuficiente.");
			System.out.println("=====================");
		}
		
	}
	
	public Cuentas ObtenerDatosCuentas(ArrayList<Cuentas> listaCuenta, String numCuenta, String tipo) {
		
		for (Cuentas cuentas : listaCuenta) {
			if(cuentas.getTarjeta().getnumeroCuenta().equals(numCuenta) && cuentas.getTipo().equals(tipo)) {
				
				return cuentas;
			}
		}	
		return null;
	}

	
	
	
	
}
