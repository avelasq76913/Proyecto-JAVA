/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.ConsultarClientes;
import java.util.ArrayList;

/**
 *
 * @author arley
 */
public class AgendaClientes {

    private ArrayList<Cliente> Lista = new ArrayList<Cliente>();

    public void Guardar(int cedula, String nombre, String apellido, Long celular, String direccion, String medio) {
        Cliente objetoCliente = new Cliente(cedula, nombre, apellido, celular, direccion, medio);
        this.Lista.add(objetoCliente);
    }

    //Metodo simple para mostrar ellos datos del arraylist
    public void getMostrar() {
        for (Cliente elemento : this.Lista) {
            
            System.out.println(elemento.getCedulaAtrib());
            System.out.println(elemento.getNombreAtrib());
            System.out.println(elemento.getApellidoAtrib());
            System.out.println(elemento.getCelularAtrib());
            System.out.println(elemento.getDireccionAtrib());
            System.out.println(elemento.getMedioAtrib());
        }
        // metodo que retorna la lista 
    }

    public ArrayList <Cliente> getLista() {
        return Lista;
    }
}
