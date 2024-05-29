package Proyecto_Terminado;

public class Cuentas {
    private String Tipo;
	private String NumCuenta;
    private Cliente cliente;
	//private int Nip;
	//private double Saldo;


    private Cuentas(String Tipo, String NumCuenta, Cliente cliente){
        this.Tipo=Tipo;
        this.NumCuenta=NumCuenta;
        this.cliente=cliente;
    }

    public String Tipo(){
        return Tipo;
    }

    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
 
    public String getNumCuenta(){
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta){
        this.NumCuenta=NumCuenta;
    }

    public Cliente getcliente(){
        return cliente;
    }

    public void setcliente(Cliente cliente){
        this.cliente=cliente;
    }


}

