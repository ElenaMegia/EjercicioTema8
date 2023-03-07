package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Obra> obras = new ArrayList<>();
    static ArrayList<Pedido> pedidos = new ArrayList<>();

    public  void Ejercicio2metodo() {
        int opcion = 0;

        do {
            System.out.println("\n-- Menú --\n");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear clientes");
            System.out.println("3 - Crear una obra");
            System.out.println("4 - Crear un pedido");
            System.out.println("5 - Mostrar pedidos");
            System.out.println("6 - Salir");

            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    mostrarClientes();
                    break;
                case 2:
                    crearCliente();
                    break;
                case 3:
                    crearObra();
                    break;
                case 4:
                    crearPedido(clientes, obras);
                    break;
                case 5:
                    mostrarPedidos();
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }

    private static void mostrarPedidos() {
        System.out.println("\n-- Pedidos --\n");
        for (Pedido pedido : pedidos) {
            System.out.println( pedido.toString());
        }
    }


    private static void mostrarClientes() {
        System.out.println("\n-- Clientes --\n");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void crearCliente() {
        System.out.print("\n¿Nombre? ");
        String nombre = scanner.nextLine();

        int id = clientes.size() + 1;

        Cliente cliente = new Cliente(nombre, id);
        clientes.add(cliente);

        System.out.println("\nCliente creado con éxito.");
    }

    private static void crearObra() {
        System.out.println("\n¿Tipo?");
        System.out.println("1 - Libro");
        System.out.println("2 - Vídeo");

        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer de entrada

        System.out.print("\n¿Título? ");
        String titulo = scanner.nextLine();

        System.out.print("¿Autor? ");
        String autor = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("¿Número de páginas? ");
                int numPaginas = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer de entrada

                Libro libro = new Libro(titulo, autor, numPaginas);
                obras.add(libro);

                System.out.println("\nLibro " + libro + " añadido");
                break;
            case 2:
                System.out.print("¿Duración (minutos)? ");
                int duracion = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer de entrada

                Video video = new Video(titulo, autor, duracion);
                obras.add(video);

                System.out.println("\nVídeo " + video + " añadido");
                break;
            default:
                System.out.println("\nTipo no válido. Intente nuevamente.");
                break;
        }
    }

    private static void crearPedido(List<Cliente> listaClientes, List<Obra> listaObras) {
        System.out.println("\n-- Crear un pedido --");
        // Mostrar la lista de clientes disponibles
        System.out.println("Seleccione el cliente para el que desea crear un pedido:");
        mostrarListaClientes(listaClientes);
        int indexCliente = leerEntero("Seleccione un cliente por su número: ", 1, listaClientes.size()) - 1;
        Cliente cliente = listaClientes.get(indexCliente);

        // Mostrar la lista de obras disponibles
        System.out.println("\nSeleccione las obras que desea agregar al pedido (seleccione terminar pedido para finalizar):");
        List<Obra> obrasPedido = new ArrayList<>();
        boolean terminarPedido = false;
        do {
            mostrarListaObras(listaObras);
            int indexObra = leerEntero("Seleccione una obra por su número: ", 1, listaObras.size());
            if (indexObra == listaObras.size() + 1) {
                // El usuario ha seleccionado "Terminar pedido"
                terminarPedido = true;
            } else if (obrasPedido.contains(listaObras.get(indexObra - 1))) {
                System.out.println("La obra ya ha sido seleccionada para el pedido.");
            } else {
                obrasPedido.add(listaObras.get(indexObra - 1));
                System.out.println("Obra agregada al pedido.");
            }
        } while (!terminarPedido);

        // Crear un nuevo pedido
        Pedido pedido = new Pedido(cliente, obrasPedido);
        cliente.agregarPedido(pedido);
        System.out.println("Pedido creado y agregado al cliente " + cliente.getNombre() + ".");
        pedidos.add(pedido);
    }

    private static void mostrarListaClientes(List<Cliente> listaClientes) {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println((i + 1) + " - " + listaClientes.get(i));
        }
    }

    private static void mostrarListaObras(List<Obra> listaObras) {
        for (int i = 0; i < listaObras.size(); i++) {
            System.out.println((i + 1) + " - " + listaObras.get(i));
        }
        System.out.println((listaObras.size() + 1) + " - Terminar pedido");
    }

    private static int leerEntero(String s, int i, int size) {
        int opcion = 0;
        do {
            System.out.print(s);
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer de entrada
            if (opcion < i || opcion > size + 1) {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion < i || opcion > size + 1);
        return opcion;
    }
}
