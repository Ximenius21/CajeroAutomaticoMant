package Proyecto_Terminado;

import java.util.ArrayList;

public class Transferencia extends Clase_Abstractaa {

    public Transferencia(String idTransaccion, String fecha, String tipo, double monto, String cuentaDestino){
        super(idTransaccion, fecha, tipo, monto, cuentaDestino);
    }

	//METODO TRANSFERENCIA PARAMETROS CUENTAORIGEN, CUENTADESTINO, TIPO Y MONTO
    public void Transacciones(String cuentaOrigen,String cuentaDestino, String tipo, double monto, Banco banco) {
    			System.out.print("Cuanto quieres Transferir: ");
                Transferir(cuentaOrigen, cuentaDestino, tipo, monto, banco);
    }
    
    public void Transferir(String cuentaOrigen,String cuentaDestino, String tipo, double monto, Banco banco){
    	ArrayList<Cuentas> listaCuenta = banco.getListaCuentas();
		Cuentas cta = ObtenerDatosCuentas(listaCuenta, cuenta, tipo);
		

        if (monto <= cte2.getSaldo()) {
           cte2.setSaldo(cte2.getSaldo()-monto);
           cte3.setSaldo(cte3.getSaldo()+monto);
            System.out.println("====================================");
            System.out.println("=================BBVA===============");
            System.out.println("				Debito				");
            System.out.println("Se relalizo una Consulta el 31/10/2023");
            System.out.println("A la cuenta "+cuentaOrigen);
            System.out.println("transferiste : " + monto);
            System.out.println("Tu saldo actual es: " + cte2.getSaldo());
            System.out.println("====================================");
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente");
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