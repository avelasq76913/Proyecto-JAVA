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
public class Cubrelecho {

    public String tamanoAtrib;
    public String disenoAtrib;
    public String materialAtrib;
    public String diseno2Atrib;
    public String material2Atrib;

    public Cubrelecho(String tamano, String diseno, String diseno2, String material, String material2) {
        this.tamanoAtrib = tamano;
        this.disenoAtrib = diseno;
        this.materialAtrib = material;
        this.diseno2Atrib = diseno2;
        this.material2Atrib = material2;
    }

    public static ArrayList CrearCubrelecho() {
        ArrayList nuevoCubrelecho = new ArrayList();
        System.out.println("Ingrese los Datos del Cubrelecho");

        System.out.println("Tamaño: ");
        Scanner entrada1 = new Scanner(System.in);
        String tamano = entrada1.nextLine();

        System.out.println("Diseño: ");
        Scanner entrada2 = new Scanner(System.in);
        String diseno = entrada2.nextLine();

        System.out.println("Diseño2: ");
        Scanner entrada3 = new Scanner(System.in);
        String diseno2 = entrada3.nextLine();

        System.out.println("Material: ");
        Scanner entrada4 = new Scanner(System.in);
        String material = entrada4.nextLine();

        System.out.println("Material2: ");
        Scanner entrada5 = new Scanner(System.in);
        String material2 = entrada5.nextLine();

        nuevoCubrelecho.add(tamano);
        nuevoCubrelecho.add(diseno);
        nuevoCubrelecho.add(diseno2);
        nuevoCubrelecho.add(material);
        nuevoCubrelecho.add(material2);

        return nuevoCubrelecho;
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

    public String getDiseno2Atrib() {
        return diseno2Atrib;
    }

    public void setDiseno2Atrib(String diseno2Atrib) {
        this.diseno2Atrib = diseno2Atrib;
    }

    public String getMaterial2Atrib() {
        return material2Atrib;
    }

    public void setMaterial2Atrib(String material2Atrib) {
        this.material2Atrib = material2Atrib;
    }

    @Override
    public String toString() {
        return "Tamaño: " + tamanoAtrib
                + " Diseño: " + disenoAtrib
                + " Material: " + materialAtrib
                + " Diseño2: " + diseno2Atrib
                + " Material2: " + material2Atrib;

    }
}
