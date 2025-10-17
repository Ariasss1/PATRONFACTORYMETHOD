public class ImpresionBlancoNegro extends Impresion {

    // Con la anotación @Override indico que estoy sobrescribiendo
    // el método abstracto 'imprimir()' definido en la clase padre Impresion.
    // Aquí le doy una implementación específica para el caso BLANCO Y NEGRO.
    @Override
    public void imprimir(Foto[] fotos) {
        // Este mensaje indica al usuario qué tipo de impresión se está realizando.
        System.out.println("Imprimiendo fotos en BLANCO Y NEGRO:");

        // Uso un ciclo 'for-each' para recorrer todas las fotos que llegan por parámetro.
        // Por cada objeto 'Foto' muestro su nombre (fichero) y un indicador [B/N].
        
        // Este método recorre todas las fotos y simula que las está imprimiendo
        // en blanco y negro, mostrando el resultado por consola.
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero() + " [B/N]");
        }
    }
}
