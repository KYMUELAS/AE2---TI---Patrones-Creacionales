package modelo;

// Esta clase representa una cámara fotográfica.
// Hereda de Producto, así que también tiene nombre, precio y código.
public class Camara extends Producto {
    private String marca;         // Marca de la cámara (ej. Canon)
    private String modelo;        // Modelo específico (ej. EOS 90D)
    private String resolucion;    // Resolución de la cámara (ej. 24MP)

    // Constructor que recibe todos los datos necesarios
    public Camara(String codigo, String nombre, double precio, String marca, String modelo, String resolucion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    // Métodos para acceder a los datos específicos de la cámara
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getResolucion() { return resolucion; }

    // Simula que la cámara toma una foto y devuelve un objeto Foto
    public Foto tomarFoto() {
        return new Foto(resolucion, "JPEG", 5.0);
    }

    // Muestra información de la cámara
    @Override
    public void print() {
        System.out.println("Camara: " + nombre + " - " + marca + " " + modelo);
    }

    // Crea una copia de la cámara
    @Override
    public Producto clone() {
        return new Camara(codigo, nombre, precio, marca, modelo, resolucion);
    }

    // Devuelve el precio base de la cámara
    @Override
    public double calcularPrecio() {
        return precio;
    }
}
