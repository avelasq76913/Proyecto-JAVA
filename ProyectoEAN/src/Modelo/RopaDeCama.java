/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author arley
 */
public class RopaDeCama {

    public String tamanop;
    public String disenop;
    public String diseno2p;
    public String materialp;
    public String material2p;

    public RopaDeCama(String tamano, String diseno, String diseno2, String material, String material2) {
        tamanop = tamano;
        disenop = diseno;
        diseno2p = diseno2;
        materialp = material;
        material2p = material2;
    }

    public String getTamanop() {
        return tamanop;
    }

    public void setTamanop(String tamano) {
        this.tamanop = tamano;
    }

    public String getDisenop() {
        return disenop;
    }

    public void setDisenop(String disenop) {
        this.disenop = disenop;
    }

    public String getDiseno2p() {
        return diseno2p;
    }

    public void setDiseno2p(String disenoCaraDos) {
        this.diseno2p = disenoCaraDos;
    }

    public String getMaterialp() {
        return materialp;
    }

    public void setMaterialp(String material) {
        this.materialp = material;
    }

    public String getMaterial2p() {
        return material2p;
    }

    public void setMaterial2p(String material2) {
        this.material2p = material2;
    }
}
