/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartosCasa;

/**
 *
 * @author core
 */
public class Cocina {
    private String estufa;
    private String refrigerador;

    public Cocina() {
    }

    public Cocina(String estufa, String refrigerador) {
        this.estufa = estufa;
        this.refrigerador = refrigerador;
    }

    public String getEstufa() {
        return estufa;
    }

    public void setEstufa(String estufa) {
        this.estufa = estufa;
    }

    public String getRefrigerador() {
        return refrigerador;
    }

    public void setRefrigerador(String refrigerador) {
        this.refrigerador = refrigerador;
    }
    public void encenderLuz(){
        System.out.println("Encendiendo luz");
    }
   
}
