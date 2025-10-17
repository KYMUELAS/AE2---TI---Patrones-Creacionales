package modelo;

import java.util.List;

// Esta clase representa a un cliente que hace pedidos
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    // Constructor con los datos del cliente
    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos para acceder a los datos del cliente
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    // Método para realizar un pedido con una lista de productos
    public Pedido realizarPedido(List<Producto> productos) {
        return new Pedido(this, productos);
    }

    // Método simulado para consultar un pedido
    public Pedido consultarPedido() {
        return null;
    }
}
