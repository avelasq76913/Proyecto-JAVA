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
public class Cliente extends Persona {

    private String medioAtrib;

    public Cliente(int cedula, String nombre, String apellido, Long celular, String direccion, String medio) {
        super(cedula, nombre, apellido, celular, direccion);
        this. medioAtrib= medio;
    }

    public static ArrayList CrearCliente() {
        ArrayList nuevoCliente = new ArrayList();
        System.out.println("Ingrese los Datos del Cliente");

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

        System.out.println("Medio De Pago: ");
        Scanner entrada6 = new Scanner(System.in);
        String medio = entrada6.nextLine();

        nuevoCliente.add(cedula);
        nuevoCliente.add(nombre);
        nuevoCliente.add(apellido);
        nuevoCliente.add(celular);
        nuevoCliente.add(direccion);
        nuevoCliente.add(medio);
        System.out.println(nuevoCliente.get(5));
        return nuevoCliente;
    }

    public String getMedioAtrib() {
        return medioAtrib;
    }

    public void setMedioAtrib(String medio) {
        this.medioAtrib = medio;
    }

    @Override
    public String toString() {
        return "Datos del Cliente: {" + ""
                + "Cedula: " + cedulaAtrib + ", "
                + "Nombre: " + nombreAtrib + ", "
                + "Apellido: " + apellidoAtrib + ", "
                + "Celular: " + celularAtrib + ", "
                + "Direccion: " + direccionAtrib + ""
                + "Medio de pago: " + medioAtrib + '}';
    }
}