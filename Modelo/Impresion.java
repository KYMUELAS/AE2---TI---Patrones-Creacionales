package modelo;

// Esta clase representa una impresión física de una foto.
// También hereda de Producto.
public class Impresion extends Producto {
    private String superficie;   // Tipo de papel (ej. Mate)
    private String color;        // Tipo de impresión (Color o Blanco y negro)
    private double tamano;       // Tamaño en pulgadas

    // Constructor que recibe los datos de la impresión
    public Impresion(String codigo, String nombre, double precio, String superficie, String color, double tamano) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.superficie = superficie;
        this.color = color;
        this.tamano = tamano;
    }

    // Métodos para acceder a los datos de la impresión
    public String getSuperficie() { return superficie; }
    public String getColor() { return color; }
    public double getTamano() { return tamano; }

    // Muestra información de la impresión
    @Override
    public void print() {
        System.out.println("Impresion: " + nombre + " - " + color + " sobre " + superficie);
    }

    // Crea una copia de la impresión
    @Override
    public Producto clone() {
        return new Impresion(codigo, nombre, precio, superficie, color, tamano);
    }

    // Calcula el precio según el tamaño
    @Override
    public double calcularPrecio() {
        return precio + (tamano * 0.5);
    }
}
