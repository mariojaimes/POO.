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
public class Recamara {
    private String cama;
    private String armario;

    public Recamara() {
    }

    public Recamara(String cama, String armario) {
        this.cama = cama;
        this.armario = armario;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        this.armario = armario;
    }
    public void encenderLuz(){
        System.out.println("Encendiendo luz");
    }
    
}
