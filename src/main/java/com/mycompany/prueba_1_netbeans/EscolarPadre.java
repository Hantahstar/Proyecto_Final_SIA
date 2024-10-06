package com.mycompany.prueba_1_netbeans;

public class EscolarPadre {
    private String cadena;

    public EscolarPadre(){
        cadena = "";
    }
    //Setters y getters con nombres
    public void agregarCadena(String cadena){
        this.cadena = cadena;
    }
    //Base para guardar la cadena en clases hijas
    public String guardarCadena(){
        return cadena;
    }
}
