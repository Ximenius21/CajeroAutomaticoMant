package Proyecto_Terminado;

public class Retiro extends Clase_Abstractaa {

	//METODO RETIRAR PARAMETRO CUENTA, TIPO, MONTO
	public Retiro(String idTransaccion, String fecha, String tipo, double monto) {
		super(idTransaccion, fecha, tipo, monto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Transacciones(String cuenta,String cuentaDestino, String tipo, double monto) {
		 Retirar(cuenta, tipo, monto);	
	}

	public void Retirar(String cuenta, String tipo, double monto) {
		
		 
		//Retirar dinero de cuenta
		if(monto <= cte2.getSaldo()) {
			cte2.setSaldo(cte2.getSaldo()-monto);
			System.out.println("====================================");
			System.out.println("=================BBVA===============");
			System.out.println("				Debito				");
			System.out.println("Se relalizo una Consulta el 31/10/2023");
			System.out.println("Retiraste : " + monto);
			System.out.println("Tu saldo actual es: " + cte2.getSaldo());
			System.out.println("====================================");
			
		}else {
			System.out.println("=====================");
			System.out.println("Saldo insuficiente.");
			System.out.println("=====================");
		}
		
	}

	
	
	
}
