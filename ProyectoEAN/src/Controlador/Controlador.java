/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgendaClientes;
import Vista.CantidadesPedido;
import Vista.ConsultarClientes;
import Vista.FormularioCliente;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    //atributos
    VistaPrincipal vista;
    FormularioCliente cliente;
    AgendaClientes agenda;

    public Controlador(VistaPrincipal objetoVistaEntrada) {
        this.vista = objetoVistaEntrada;
        this.vista.setVisible(true);
        agregarEventosVistaPrincipal();
    }

    private void agregarEventosVistaPrincipal() {
        this.vista.getBotonRegistrarCliente().addActionListener(this);
        this.vista.getBotonConsultarClientes().addActionListener(this);
        this.vista.getBotonRegistrarPedido().addActionListener(this);
        this.vista.getConsultarPedidos().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Opcion numero uno registrar nuevo cliente

        if (ae.getSource() == this.vista.getBotonRegistrarCliente()) {
            vista.dispose();
            FormularioCliente nuevo = new FormularioCliente();
            nuevo.setVisible(true);
            int cedula = Integer.parseInt(this.cliente.getCedula().getText());
            String nombre = this.cliente.getNombre().getText();
            String apellido = this.cliente.getApellido().getText();
            Long celular = Long.parseLong(this.cliente.getCelular().getText());
            String direccion = this.cliente.getDireccion().getText();
            String medio = this.cliente.getMedio().getText();

            this.agenda.Guardar(cedula, nombre, apellido, celular, direccion, medio);
            //this.agenda.getLista();
            //this.agenda.getMostrar();

            // Opcion numero DOS consultar clientes
    

        } else if (ae.getSource() == this.vista.getBotonConsultarClientes()) {
            vista.dispose();
            ConsultarClientes nuevoCliente = new ConsultarClientes();
            nuevoCliente.setVisible(true);

            // Opcion numero TRES registrar nuevo pedido
        } else if (ae.getSource() == this.vista.getBotonRegistrarPedido()) {
            vista.dispose();
            //FormularioPedido nuevoCliente = new FormularioPedido();
            //nuevoCliente.setVisible(true);

            // Opcion numero CUATRO consultar pedidos
        } else if (ae.getSource() == this.vista.getConsultarPedidos()) {
            vista.dispose();
            CantidadesPedido nuevoCliente = new CantidadesPedido();
            nuevoCliente.setVisible(true);
        }
    }

    private void registrarCliente() {
    }
}
