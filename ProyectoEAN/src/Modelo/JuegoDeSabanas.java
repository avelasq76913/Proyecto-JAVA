/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arley
 */
public class JuegoDeSabanas {

    /*atributos*/
    private String tamanoAtrib;
    private String disenoAtrib;
    private String materialAtrib;

    /*constructor*/
    public JuegoDeSabanas(String tamano, String diseno, String material) {
        this.tamanoAtrib = tamano;
        this.disenoAtrib = diseno;
        this.materialAtrib = material;
    }

    /*metodos*/
    public static ArrayList Crear() {
        ArrayList nuevoJuegoDeSabanas = new ArrayList();
        System.out.println("Ingrese los Datos del Juego de sabanas");

        System.out.println("Tamaño: ");
        Scanner entrada1 = new Scanner(System.in);
        String tamano = entrada1.nextLine();

        System.out.println("Diseño: ");
        Scanner entrada2 = new Scanner(System.in);
        String diseno = entrada2.nextLine();

        System.out.println("Material: ");
        Scanner entrada3 = new Scanner(System.in);
        String material = entrada3.nextLine();

        nuevoJuegoDeSabanas.add(tamano);
        nuevoJuegoDeSabanas.add(diseno);
        nuevoJuegoDeSabanas.add(material);

        return nuevoJuegoDeSabanas;

    }

    public String getTamanoAtrib() {
        return tamanoAtrib;
    }

    public void setTamanoAtrib(String tamanoAtrib) {
        this.tamanoAtrib = tamanoAtrib;
    }

    public String getDisenoAtrib() {
        return disenoAtrib;
    }

    public void setDisenoAtrib(String disenoAtrib) {
        this.disenoAtrib = disenoAtrib;
    }

    public String getMaterialAtrib() {
        return materialAtrib;
    }

    public void setMaterialAtrib(String materialAtrib) {
        this.materialAtrib = materialAtrib;
    }

    @Override
    public String toString() {
        return "Tamaño: " + tamanoAtrib
                + " Diseño: " + disenoAtrib
                + " Material: " + materialAtrib;
    }
}
