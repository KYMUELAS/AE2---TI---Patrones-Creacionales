package modelo;

// Esta clase abstracta representa cualquier producto que se pueda vender.
// No se puede usar directamente, solo sirve como base para otros productos como Camara, Foto, Impresion.
public abstract class Producto {
    protected String codigo;     // Código único del producto
    protected String nombre;     // Nombre del producto
    protected double precio;     // Precio base del producto

    // Métodos para obtener los datos del producto
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    // Permite cambiar el precio del producto
    public void setPrecio(double precio) { this.precio = precio; }

    // Aplica un descuento al precio actual
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }

    // Métodos que deben ser definidos por las clases hijas
    public abstract void print();               // Muestra información del producto
    public abstract Producto clone();           // Crea una copia del producto
    public abstract double calcularPrecio();    // Calcula el precio final del producto
}
