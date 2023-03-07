package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Obra> obras = new ArrayList<Obra>();

    public Pedido(Cliente cliente, List<Obra> obrasPedido) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public void eliminarObra(Obra obra) {
        obras.remove(obra);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente.getNombre() +
                ", obras=" + obras+
                '}';
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}



