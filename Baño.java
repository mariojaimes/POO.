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
public class Baño {
    private String regadera;
    private String retrete;

    public Baño() {
    }

    public Baño(String regadera, String retrete) {
        this.regadera = regadera;
        this.retrete = retrete;
    }

    public String getRegadera() {
        return regadera;
    }

    public void setRegadera(String regadera) {
        this.regadera = regadera;
    }

    public String getRetrete() {
        return retrete;
    }

    public void setRetrete(String retrete) {
        this.retrete = retrete;
    }
    public void sacarAgua(){
        System.out.println("La regadera esta abierta");
    }
    
}
