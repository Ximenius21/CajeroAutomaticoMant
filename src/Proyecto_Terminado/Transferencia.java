package Proyecto_Terminado;

import java.util.ArrayList;

public class Transferencia extends Clase_Abstractaa {

    public Transferencia(String idTransaccion, String fecha, String tipo, double monto, String cuentaDestino){
        super(idTransaccion, fecha, tipo, monto, cuentaDestino);
    }

	//METODO TRANSFERENCIA PARAMETROS CUENTAORIGEN, CUENTADESTINO, TIPO Y MONTO
    public void Transacciones(String cuentaOrigen,String cuentaDestino, String tipo, double monto, Banco banco) {
    			
                Transferir(cuentaOrigen, cuentaDestino, tipo, monto, banco);
    }
    
    public void Transferir(String cuentaOrigen,String cuentaDestino, String tipo, double monto, Banco banco){
    	ArrayList<Cuentas> listaCuenta = banco.getListaCuentas();
		Cuentas ctaOrg = ObtenerDatosCuentas(listaCuenta, cuentaOrigen, tipo);
		
		Cuentas ctaDes = ExisteDestino(listaCuenta, cuentaDestino);
		if(ctaDes!=null) {
			if (monto <= ctaOrg.getSaldo()) {
		           ctaOrg.setSaldo(ctaOrg.getSaldo()-monto);
		           ctaDes.setSaldo(ctaDes.getSaldo()+monto);
		            System.out.println("====================================");
		            System.out.println("=================BBVA===============");
		            System.out.println("				Debito				");
		            System.out.println("Se realizo una Consulta el 31/10/2023");
		            System.out.println("A la cuenta "+cuentaOrigen);
		            System.out.println("transferiste : " + monto);
		            System.out.println("a la cuenta: "+ctaDes.getTarjeta().getnumeroCuenta());
		            System.out.println("Tu saldo actual es: " + ctaOrg.getSaldo());
		            System.out.println("====================================");
		        } else {
		            System.out.println("=====================");
		            System.out.println("Saldo insuficiente");
		            System.out.println("=====================");
		        }
		}else {
			System.out.println("La cuenta destino no existe");
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
    
    public Cuentas ExisteDestino(ArrayList<Cuentas> listaCuenta, String numCuenta) {
    	for (Cuentas cuentas : listaCuenta) {
			if(cuentas.getTarjeta().getnumeroCuenta().equals(numCuenta)){
				return cuentas;
			}
		}
    	return null;
    }
    
    


}