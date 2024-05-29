package Proyecto_Terminado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Cliente> listaCliente;
    public static void main(String[] args) {
        Cajero cajero=new Cajero("Centro", null)

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    	
    	listaCliente.add(new Cliente("Ximena Hernandez", "Cuenta Ahorro", "12345678", 2104, 1700.00));
    	listaCliente.add(new Cliente("Kimberly Huape", "Cuenta Ahorro", "46372689", 9802, 1700.00));
    	listaCliente.add(new Cliente("Yahir Ramirez", "Cuenta Cheques", "73664839", 9000, 1700.00));
    	listaCliente.add(new Cliente("Esmeralda Montoya", "Cuenta Cheques", "12238558", 3022, 1700.00));
    	
    	Menu();
       
    }
    
    public static void Menu() {
    
    	int idRetirar = 0;
    	int idTransferir = 0;
    	
    	int op=0;
    	System.out.println("=========================================");
		System.out.println("		CAJERO AUTOMATICO	");
    	do {
    		
    		System.out.println("=========================================");
        	System.out.println("	1. Retirar ");
        	System.out.println("	2. Transferir");
        	System.out.println("=========================================");
        	System.out.println("Ingresa opcion: ");
        	op = entrada.nextInt();
        	if(op == 1) {
        		System.out.println("----------------------------------------------------");
                System.out.println("Ingrese su Nombre: ");
                String Nombre = entrada.nextLine();
                System.out.println("Ingrese su Numero de cuenta: ");
                String Num_cuenta = entrada.nextLine();
                System.out.println("Ingrese su Nip:		(8002)");
                int Nip = entrada.nextInt();
                System.out.println("Ingresa el Monto: ");
                double monto = entrada.nextDouble();
                //BUSCAR EL CTE EN LA LISTA DE CLIENTES
                Cliente cte = new Cliente();
                Cliente cte2 = cte.obtenerCliente(Nombre);
                
                idRetirar++;
                Retiro retirar = new Retiro(String.valueOf(idRetirar), "28/05/2024", "Retiro", monto);
                retirar.Transacciones(Num_cuenta,null, cte2.getTipo(), monto);
                
                
        	}else if(op == 2) {
				System.out.println("----------------------------------------------------");
                System.out.println("Ingrese su Nombre: ");
                String Nombre = entrada.nextLine();
                System.out.println("Ingrese su Numero de cuenta: ");
                String Num_cuenta = entrada.nextLine();
                System.out.println("Ingrese su Nip:		(8002)");
                int Nip = entrada.nextInt();
                System.out.println("Ingresa el Monto: ");
                double monto = entrada.nextDouble();
				System.out.println("Ingrese la cuenta de destino:");
				String Num_cuentaDes= entrada.nextLine();
                //BUSCAR EL CTE EN LA LISTA DE CLIENTES
                Cliente cte = new Cliente();
                Cliente cte2 = cte.obtenerCliente(Nombre);
                
                idTransferir++;
                Transferencia transferir = new Transferencia(String.valueOf(idTransferir), "28/05/2024", "Transferir", monto, Num_cuentaDes);
                transferir.Transacciones(Num_cuenta,Num_cuentaDes, cte2.getTipo(), monto);
        	}
        	
    	}while(op!=0);
    	
    }
    public String getNombre(){
        return getNombre();
    }
    
    
}

