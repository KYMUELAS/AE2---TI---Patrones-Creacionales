package modelo;

// Esta clase representa una foto digital.
// También hereda de Producto.
public class Foto extends Producto {
    private String resolucion;   // Resolución de la foto (ej. 24MP)
    private String formato;      // Formato de archivo (ej. JPEG)
    private double tamano;       // Tamaño en MB

    // Constructor que recibe los datos de la foto
    public Foto(String resolucion, String formato, double tamano) {
        this.resolucion = resolucion;
        this.formato = formato;
        this.tamano = tamano;
        this.nombre = "Foto";
        this.precio = calcularPrecio(); // Calcula el precio automáticamente
    }

    // Métodos para acceder a los datos de la foto
    public String getResolucion() { return resolucion; }
    public String getFormato() { return formato; }
    public double getTamano() { return tamano; }

    // Muestra información de la foto
    @Override
    public void print() {
        System.out.println("Foto: " + resolucion + " - " + formato);
    }

    // Crea una copia de la foto
    @Override
    public Producto clone() {
        return new Foto(resolucion, formato, tamano);
    }

    // Calcula el precio según el tamaño de la foto
    @Override
    public double calcularPrecio() {
        return tamano * 0.3;
    }
}
