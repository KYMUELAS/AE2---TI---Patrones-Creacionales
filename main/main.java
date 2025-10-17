package main;

import modelo.*;
import fabrica.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creamos un cliente con sus datos personales
        Cliente cliente = new Cliente(
            "Karen",
            "Calle 123, El Hormiguero",
            "3124567890",
            "karen@email.com"
        );

        // Creamos una fábrica que sabe cómo construir productos (cámara e impresión)
        DispositivoFactory fabrica = new DispositivoFactoryImpl();

        // Usamos la fábrica para crear una cámara
        Camara camara = fabrica.crearCamara();

        // Simulamos que la cámara toma una foto
        Foto foto = camara.tomarFoto();

        // Usamos la fábrica para transformar esa foto en una impresión
        Impresion impresion = fabrica.crearImpresion(foto);

        // Creamos una lista de productos que el cliente quiere pedir
        List<Producto> productos = new ArrayList<>();
        productos.add(camara);     // Agregamos la cámara
        productos.add(foto);       // Agregamos la foto tomada
        productos.add(impresion);  // Agregamos la impresión de la foto

        // El cliente realiza el pedido con esos productos
        Pedido pedido = cliente.realizarPedido(productos);

        // Mostramos los datos del pedido
        System.out.println("Pedido #" + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());

        // Mostramos los productos incluidos en el pedido
        System.out.println("\nProductos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            p.print(); // Muestra la información del producto (cámara, foto, impresión)
            System.out.println("Precio: $" + p.calcularPrecio());
            System.out.println("---");
        }

        // Calculamos el total del pedido sumando los precios de todos los productos
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);
    }
}
