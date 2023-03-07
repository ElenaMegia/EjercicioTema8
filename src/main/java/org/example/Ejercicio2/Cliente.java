package org.example.Ejercicio2;

public class Cliente {
    private String nombre;
    private int id;

    public Cliente() {
    }

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }


    public void agregarPedido(Pedido pedido) {
        pedido.setCliente(this);
    }
}