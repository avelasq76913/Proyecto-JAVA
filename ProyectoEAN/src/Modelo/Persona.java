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
public class Persona {

    /*atributos*/
    int cedulaAtrib;
    String nombreAtrib;
    String apellidoAtrib;
    Long celularAtrib;
    String direccionAtrib;

    /*constructor*/
    public Persona(int cedula, String nombre,String apellido, Long celular, String direccion) {
        cedulaAtrib = cedula;
        nombreAtrib = nombre;
        apellidoAtrib = apellido;
        celularAtrib = celular;
        direccionAtrib = direccion;
    }
    /*metodos*/
    public int getCedulaAtrib() {
        return cedulaAtrib;
    }
    public void setCedulaAtrib(int cedula) {
        this.cedulaAtrib = cedula;
    }
    public String getNombreAtrib() {
        return nombreAtrib;
    }
    public void setNombreAtrib(String apellido) {
        this.apellidoAtrib = apellido;
    }
    public String getApellidoAtrib() {
        return apellidoAtrib;
    }
    public void setApellidoAtrib(String apellido) {
        this.apellidoAtrib = apellido;
    }
    public Long getCelularAtrib() {
        return celularAtrib;
    }
    public void setCelularAtrib(Long celular) {
        this.celularAtrib = celular;
    }
    public String getDireccionAtrib() {
        return direccionAtrib;
    }
    public void setDireccionAtrib(String direccion) {
        this.direccionAtrib = direccion;
    }    
}