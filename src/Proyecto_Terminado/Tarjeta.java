package Proyecto_Terminado;

public class Tarjeta {
    private String numeroCuenta;
    private Cliente cliente;


    private Tarjeta(String numeroCuenta, Cliente cliente){
        this.numeroCuenta=numeroCuenta;
        this.cliente=cliente;
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


}
