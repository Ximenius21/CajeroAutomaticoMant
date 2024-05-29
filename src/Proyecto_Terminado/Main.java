package Proyecto_Terminado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Cuentas> listaCuentas;
    public static void main(String[] args) {
        Cajero cajero=new Cajero("Centro", "Banco Centro");
        
        listaCuentas = new ArrayList<Cuentas>();
        Cliente cte1 = new Cliente(1, "Mariano 2965, Lopez", "Ximena Hernandez");
        Cliente cte2 = new Cliente(2, "Carlon 2893, Rincon", "Kimberly Romero");
        Cliente cte3 = new Cliente(3, "Lopez 2839, Adolfo", "Yahir Ramirez");
        Cliente cte4 = new Cliente(4, "Valle Alto 1802, Alto", "Esmeralda Montoya");
               
        Tarjeta tarjeta1 = new Tarjeta("19283888", 2829);
        Tarjeta tarjeta2 = new Tarjeta("89233728", 2783);
        Tarjeta tarjeta3 = new Tarjeta("09283748", 2999);
        Tarjeta tarjeta4 = new Tarjeta("63527382", 1234);
          
        Cuentas cuenta1 = new Cuentas("Cuenta Ahorro", tarjeta1, cte1, 1700.00);
        Cuentas cuenta2 = new Cuentas("Cuenta Ahorro", tarjeta2, cte2, 1700.00);
        Cuentas cuenta3 = new Cuentas("Cuenta Ahorro", tarjeta3, cte3, 1700.00);
        Cuentas cuenta4 = new Cuentas("Cuenta Ahorro", tarjeta4, cte4, 1700.00);
        
        listaCuentas.add(cuenta1);
        listaCuentas.add(cuenta2);
        listaCuentas.add(cuenta3);
        listaCuentas.add(cuenta4);
        
        Banco banco = new Banco("Banco Centro", listaCuentas);
 	
    	Menu(banco);
       
    }
    
    public static void Menu(Banco banco) {
    
    	int idRetirar = 0;
    	int idTransferir = 0;
    		
    	int op=0;
    	System.out.println("=========================================");
		System.out.println("		CAJERO AUTOMATICO	");
		System.out.println("=========================================");
		        
    	do {
    		System.out.println(" Ingrese su Numero de cuenta:(numero tarjeta): ");
            String Num_cuenta = entrada.nextLine();
            System.out.println(" Ingrese Tipo Cuenta: (ahorro o cheques)");
            String Tipo_cuenta = entrada.nextLine();
    		
    		System.out.println("=========================================");
        	System.out.println("	1. Retirar ");
        	System.out.println("	2. Transferir");
        	System.out.println("=========================================");
        	System.out.println(" Ingresa opcion: ");
        	op = entrada.nextInt();
        	if(op == 1) {
        		System.out.println("----------------------------------------------------");
                System.out.println("Ingrese su Nip:		(8002)");
                int Nip = entrada.nextInt();
                System.out.println("Ingresa el Monto: ");
                double monto = entrada.nextDouble();
                //BUSCAR EL CTE EN LA LISTA DE CLIENTES
                
                idRetirar++;
                Retiro retirar = new Retiro(String.valueOf(idRetirar), "28/05/2024", "Retiro", monto);
                retirar.Transacciones(Num_cuenta,null, Tipo_cuenta, monto, banco);
                                           
        	}else if(op == 2) {
				System.out.println("----------------------------------------------------");
                System.out.println("Ingrese su Nip:		(8002)");
                int Nip = entrada.nextInt();
                System.out.println("Ingresa el Monto: ");
                double monto = entrada.nextDouble();
				System.out.println("Ingrese la cuenta de destino:");
				String Num_cuentaDes= entrada.nextLine();
                             
                idTransferir++;
                Transferencia transferir = new Transferencia(String.valueOf(idTransferir), "28/05/2024", "Transferir", monto, Num_cuentaDes);
                transferir.Transacciones(Num_cuenta,Num_cuentaDes, Tipo_cuenta, monto, banco);
        	}
        	
    	}while(op!=0);
    	
    }
    public String getNombre(){
        return getNombre();
    }
    
    
}

