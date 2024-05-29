package Proyecto_Terminado;

public class Cuentas {
    private String Tipo;
	private Tarjeta tarjeta;
    private Cliente cliente;
    private double Saldo;
	//private int Nip;
	//private double Saldo;


    public Cuentas(String Tipo, Tarjeta tarjeta, Cliente cliente, double Saldo){
        this.Tipo=Tipo;
        this.tarjeta=tarjeta;
        this.cliente=cliente;
        this.Saldo = Saldo;
    }

    public String getTipo(){
        return Tipo;
    }
    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
    public Tarjeta getTarjeta(){
        return tarjeta;
    }

    public void setTarjetaa(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public Cliente getcliente(){
        return cliente;
    }

    public void setcliente(Cliente cliente){
        this.cliente=cliente;
    }

    public double getSaldo(){
        return this.Saldo;
    }

    public void setSaldo(double Saldo){
        this.Saldo=Saldo;
    }
    

}

