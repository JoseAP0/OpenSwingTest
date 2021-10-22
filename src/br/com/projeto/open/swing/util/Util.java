package br.com.projeto.open.swing.util;

public class Util {
    
    private static Alerta objalert;
    
    public static Alerta getAlert(){
        
        if (objalert == null){
            objalert = new Alerta();
        }
        
        return objalert;
    }   
}
