package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    private Cliente NuevoCliente;
    private JuegoDeSabanas nuevoJuegoDeSabanas;
    private Cubrelecho nuevoCubrelecho;

    //Constructor
    public Pedido(Cliente NuevoCliente, JuegoDeSabanas nuevoJuegoDeSabanas, Cubrelecho nuevoCubrelecho) {
        this.NuevoCliente = NuevoCliente;
        this.nuevoJuegoDeSabanas = nuevoJuegoDeSabanas;
        this.nuevoCubrelecho = nuevoCubrelecho;
    }

    public void MostrarCliente() {
        System.out.println("Datos del Cliente");
        System.out.println("Cedula: " + NuevoCliente.getCedulaAtrib());
        System.out.println("Nombre: " + NuevoCliente.getNombreAtrib());
        System.out.println("Apellido: " + NuevoCliente.getApellidoAtrib());
        System.out.println("Celular: " + NuevoCliente.getCelularAtrib());
        System.out.println("Direccion:" + NuevoCliente.getDireccionAtrib());
        System.out.println("Medio de pago: " + NuevoCliente.getMedioAtrib());
    }

    public void MostrarJuegoDeSabanas() {
        System.out.println("Datos del Juego de Sabanas");
        System.out.println("Tamaño: " + nuevoJuegoDeSabanas.getTamanoAtrib());
        System.out.println("Diseño: " + nuevoJuegoDeSabanas.getDisenoAtrib());
        System.out.println("Material: " + nuevoJuegoDeSabanas.getMaterialAtrib());
    }

    public void MostrarCubrelecho() {
        System.out.println("Datos del Cubrelecho");
        System.out.println("Tamaño: " + nuevoCubrelecho.getTamanoAtrib());
        System.out.println("Diseño: " + nuevoCubrelecho.getDisenoAtrib());
        System.out.println("Material: " + nuevoCubrelecho.getMaterialAtrib());
        System.out.println("Diseño Posterior: " + nuevoCubrelecho.getDiseno2Atrib());
        System.out.println("Material Posterior: " + nuevoCubrelecho.getMaterial2Atrib());
    }

    public static ArrayList SolicitarCantidades() {
        ArrayList Cantidades = new ArrayList();
        System.out.println("¿Numero de sabanas?");
        Scanner entrada = new Scanner(System.in);
        int numeroSabanas = entrada.nextInt();
        System.out.println("¿Numero de Cubrelechos?");
        Scanner entrada1 = new Scanner(System.in);
        int numeroCubrelechos = entrada1.nextInt();
        System.out.println("El nuevo pedido contiene: " + numeroSabanas + " juegos de Sabanas y " + numeroCubrelechos + " cubrelechos");

        Cantidades.add(numeroSabanas);
        Cantidades.add(numeroCubrelechos);

        return Cantidades;
    }

    public static Pedido CrearPedido() {
        //Crear objeto cliente
        ArrayList Data = Cliente.CrearCliente();
        Cliente ObjetoCliente = new Cliente((int) Data.get(0), (String) Data.get(1), (String) Data.get(2), (Long) Data.get(3), (String) Data.get(4), (String) Data.get(5));
        //Solicitar cantidadesdepedido
        ArrayList Cantidades = Pedido.SolicitarCantidades();

        //Crear objeto juego desabanas
        ArrayList DataJuegoDeSabanas = JuegoDeSabanas.Crear();
        JuegoDeSabanas ObjetoJuegoDeSabanas = new JuegoDeSabanas((String) DataJuegoDeSabanas.get(0), (String) DataJuegoDeSabanas.get(1), (String) DataJuegoDeSabanas.get(2));

        //Crear objeto cubrelecho
        ArrayList DataCubrelecho = Cubrelecho.CrearCubrelecho();
        Cubrelecho ObjetoCubrelecho = new Cubrelecho((String) DataCubrelecho.get(0), (String) DataCubrelecho.get(1), (String) DataCubrelecho.get(2), (String) DataCubrelecho.get(3), (String) DataCubrelecho.get(4));

        //Crear pedido con los objetosantes solicitados
        Pedido ObjetoPedido = new Pedido(ObjetoCliente, ObjetoJuegoDeSabanas, ObjetoCubrelecho);
        //Imprimir cada objeto que compone el pedido Con metodo static de cada clase
        //NuevoPedido.MostrarCliente();
        //NuevoPedido.MostrarJuegoDeSabanas();
        //NuevoPedido.MostrarCubrelecho();
        return ObjetoPedido;
    }

    public Cliente getNuevoCliente() {
        return NuevoCliente;
    }

    public void setNuevoCliente(Cliente NuevoCliente) {
        this.NuevoCliente = NuevoCliente;
    }

    public JuegoDeSabanas getNuevoJuegoDeSabanas() {
        return nuevoJuegoDeSabanas;
    }

    public void setNuevoJuegoDeSabanas(JuegoDeSabanas nuevoJuegoDeSabanas) {
        this.nuevoJuegoDeSabanas = nuevoJuegoDeSabanas;
    }

    public Cubrelecho getNuevoCubrelecho() {
        return nuevoCubrelecho;
    }

    public void setNuevoCubrelecho(Cubrelecho nuevoCubrelecho) {
        this.nuevoCubrelecho = nuevoCubrelecho;
    }

    @Override
    public String toString() {
        return "Pedido: "
                + NuevoCliente
                + ", nuevoJuegoDeSabanas="
                + nuevoJuegoDeSabanas
                + ", nuevoCubrelecho="
                + nuevoCubrelecho + '}';
    }

}
