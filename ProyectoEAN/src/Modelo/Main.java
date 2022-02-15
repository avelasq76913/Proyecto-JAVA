package Modelo;


import Controlador.Controlador;
import Modelo.AgendaClientes;
import Vista.VistaPrincipal;

public class Main {
    public static void main(String args[]) {
        VistaPrincipal objetoVistaPrincipal = new VistaPrincipal();
        Controlador objetoControlador = new Controlador(objetoVistaPrincipal);
    }
}