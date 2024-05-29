package Proyecto_Terminado;

import java.util.Scanner;
public abstract class Clase_Abstractaa {
	private String idTransaccion;
    private String fecha;
    private String tipo;
    private double monto;

    public void Operaciones(String idTransaccion, String fecha, String tipo, double monto) {
       this.idTransaccion=idTransaccion;
       this.fecha=fecha;
       this.tipo=tipo;
       this.monto=monto;
    }

    public String getIdTransaccion(){
        return idTransaccion;
        
    }

    public void setIdTransaccion(String idTransaccion){
        this.idTransaccion=idTransaccion;
    }

    public String getfecha(){
        return fecha;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public double getMonto(){
        return monto;
    }

    public void setMonto(double monto){
        this.monto=monto;
    }
       
}
