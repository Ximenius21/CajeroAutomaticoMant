package Proyecto_Terminado;

public class Tarjeta {
    private String numeroCuenta;
    private Cliente cliente;
    private int nip;


    public Tarjeta(String numeroCuenta, Cliente cliente, int nip){
        this.numeroCuenta=numeroCuenta;
        this.cliente=cliente;
        this.nip = nip;
    }

    public String getnumeroCuenta(){
        return numeroCuenta;
    }

    public void setnumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
 
    public Cliente getcliente(){
        return cliente;
    }

    public void setcliente(Cliente cliente){
        this.cliente=cliente;
    }
    public Cliente getNip(){
        return cliente;
    }

    public void setNip(int nip){
        this.nip=nip;
    }



}
