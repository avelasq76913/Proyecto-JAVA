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

public class Coordinador extends Persona {    
    
    private String cargoAtrib;
    
    public Coordinador (int cedula, String nombre, String apellido, long celular, String direccion, String cargo) {
        super(cedula, nombre, apellido, celular, direccion);
        this. cargoAtrib= cargo;
    }
    public static ArrayList CrearCoordinador() {
        ArrayList nuevoCoordinador = new ArrayList();
        System.out.println("Ingrese los Datos del Coordinador");

        System.out.println("Cedula: ");
        Scanner entrada1 = new Scanner(System.in);
        int cedula = entrada1.nextInt();

        System.out.println("Nombre: ");
        Scanner entrada2 = new Scanner(System.in);
        String nombre = entrada2.nextLine();

        System.out.println("Apellido: ");
        Scanner entrada3 = new Scanner(System.in);
        String apellido = entrada3.nextLine();

        System.out.println("Celular: ");
        Scanner entrada4 = new Scanner(System.in);
        Long celular = entrada4.nextLong();

        System.out.println("Direccion: ");
        Scanner entrada5 = new Scanner(System.in);
        String direccion = entrada5.nextLine();

        String cargo = "Coordinador";

        nuevoCoordinador.add(cedula);
        nuevoCoordinador.add(nombre);
        nuevoCoordinador.add(apellido);
        nuevoCoordinador.add(celular);
        nuevoCoordinador.add(direccion);
        nuevoCoordinador.add(cargo);
        System.out.println(nuevoCoordinador.get(5));
        return nuevoCoordinador;
    }

    public String getCargoAtrib() {
        return cargoAtrib;
    }

    public void setCargoAtrib(String cargoAtrib) {
        this.cargoAtrib = cargoAtrib;
    }

    public int getCedulaAtrib() {
        return cedulaAtrib;
    }

    public void setCedulaAtrib(int cedulaAtrib) {
        this.cedulaAtrib = cedulaAtrib;
    }

    public String getNombreAtrib() {
        return nombreAtrib;
    }

    public void setNombreAtrib(String nombreAtrib) {
        this.nombreAtrib = nombreAtrib;
    }

    public String getApellidoAtrib() {
        return apellidoAtrib;
    }

    public void setApellidoAtrib(String apellidoAtrib) {
        this.apellidoAtrib = apellidoAtrib;
    }

    public Long getCelularAtrib() {
        return celularAtrib;
    }

    public void setCelularAtrib(Long celularAtrib) {
        this.celularAtrib = celularAtrib;
    }

    public String getDireccionAtrib() {
        return direccionAtrib;
    }

    public void setDireccionAtrib(String direccionAtrib) {
        this.direccionAtrib = direccionAtrib;
    }
    
    public void RealizarDespachos(){
        
    }
    public void RecolectarDinero(){
        
    }
    public void CalcularGanancias(){
        
    }
    public void ActualizarCatalogo(){
        
    }
       @Override
    public String toString() {
        return "Datos del Coordinador: {" + ""
                + "Cedula: " + cedulaAtrib + ", "
                + "Nombre: " + nombreAtrib + ", "
                + "Apellido: " + apellidoAtrib + ", "
                + "Celular: " + celularAtrib + ", "
                + "Direccion: " + direccionAtrib + ""
                + "Medio de pago: " + cargoAtrib + '}';
    }
}