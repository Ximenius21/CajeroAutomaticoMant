package Proyecto_Terminado;

public class Cuentas {
    private String Tipo;
	private String NumCuenta;
    private Cliente cliente;
    private double Saldo;
	//private int Nip;
	//private double Saldo;


    public Cuentas(String Tipo, String NumCuenta, Cliente cliente, double Saldo){
        this.Tipo=Tipo;
        this.NumCuenta=NumCuenta;
        this.cliente=cliente;
        this.Saldo = Saldo;
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

    public Cliente getSaldo(){
        return cliente;
    }

    public void setSaldo(double Saldo){
        this.Saldo=Saldo;
    }
    

}

