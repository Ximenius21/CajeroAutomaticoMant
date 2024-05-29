package Proyecto_Terminado;

public class Cajero {

    private String Localizacion;
    private String Banco;

    public Cajero(String Localizacion, String Banco){
        this.Localizacion=Localizacion;
        this.Banco=Banco;
    }

    public String getLocalizacion(){
        return Localizacion;
        
    }

    public void setLocalizacion(String Localizacion){
        this.Localizacion=Localizacion;
    }

    public String getBanco(){
        return Banco;
        
    }

    public void setBanco(String Banco){
        this.Banco=Banco;
    }
}
