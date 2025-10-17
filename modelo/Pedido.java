package modelo;

import java.util.Date;
import java.util.List;

// Esta clase representa un pedido que contiene productos y pertenece a un cliente
public class Pedido {
    private int numero;                  // Número único del pedido
    private Date fecha;                  // Fecha en que se hizo el pedido
    private EstadoPedido estado;        // Estado actual del pedido
    private Cliente cliente;            // Cliente que hizo el pedido
    private List<Producto> productos;   // Lista de productos incluidos

    // Constructor que recibe el cliente y los productos
    public Pedido(Cliente cliente, List<Producto> productos) {
        this.numero = (int)(Math.random() * 10000); // Número aleatorio
        this.fecha = new Date();                    // Fecha actual
        this.estado = EstadoPedido.PENDIENTE;       // Estado inicial
        this.cliente = cliente;
        this.productos = productos;
    }

    // Métodos para acceder a los datos del pedido
    public int getNumero() { return numero; }
    public Date getFecha() { return fecha; }
    public EstadoPedido getEstado() { return estado; }
    public Cliente getCliente() { return cliente; }
    public List<Producto> getProductos() { return productos; }

    // Calcula el total sumando los precios de todos los productos
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularPrecio).sum();
    }
} 
//