package fabrica;

import modelo.Camara;
import modelo.Foto;
import modelo.Impresion;

// Esta clase implementa la interfaz DispositivoFactory.
// Aquí se define cómo se crean realmente los productos.
public class DispositivoFactoryImpl implements DispositivoFactory {

    @Override
    public Camara crearCamara() {
        // Crea una cámara con datos específicos
        return new Camara("C001", "Canon EOS", 1200.0, "Canon", "EOS 90D", "24MP");
    }

    @Override
    public Impresion crearImpresion(Foto foto) {
        // Crea una impresión usando los datos de la foto
        return new Impresion("I001", "Impresión Fotográfica", 15.0, "Papel Mate", "Color", foto.getTamano());
    }
}
