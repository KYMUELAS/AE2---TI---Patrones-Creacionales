package fabrica;

import modelo.Camara;
import modelo.Foto;
import modelo.Impresion;

// Esta interfaz define los métodos que una fábrica debe tener.
// Sirve para crear productos sin que el cliente sepa cómo se construyen.
public interface DispositivoFactory {
    Camara crearCamara();                     // Método para crear una cámara
    Impresion crearImpresion(Foto foto);     // Método para crear una impresión a partir de una foto
}
