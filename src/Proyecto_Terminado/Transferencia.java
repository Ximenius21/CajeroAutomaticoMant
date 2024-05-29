package Proyecto_Terminado;

public class Transferencia extends Clase_Abstractaa {

    public Transferencia(String idTransaccion, String fecha, String tipo, double monto, String cuentaDestino){
        super(idTransaccion, fecha, tipo, monto, cuentaDestino);
    }

    

	//METODO TRANSFERENCIA PARAMETROS CUENTAORIGEN, CUENTADESTINO, TIPO Y MONTO
    public void Transacciones(String cuentaOrigen,String cuentaDestino, String tipo, double monto) {
    			System.out.print("Cuanto quieres Transferir: ");
                Transferir(cuentaOrigen, cuentaDestino, tipo, monto);
    }
    public void Transferir(String cuentaOrigen,String cuentaDestino, String tipo, double monto){
        Cliente cte = new Cliente();
		Cliente cte2 = cte.obtenerCliente(cuentaOrigen);
        Cliente cte3 = cte.obtenerCliente(cuentaDestino);
		

        if (monto <= cte2.getSaldo()) {
           cte2.setSaldo(cte2.getSaldo()-monto);
            System.out.println("====================================");
            System.out.println("=================BBVA===============");
            System.out.println("				Debito				");
            System.out.println("Se relalizo una Consulta el 31/10/2023");
            System.out.println("A la cuenta "+numero_cuenta);
            System.out.println("transferiste : " + transferencia);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("====================================");
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente");
            System.out.println("=====================");
        }
    }


}