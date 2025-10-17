public class ImpresionColor extends Impresion {

    // La anotación @Override indica que estoy sobrescribiendo el método
    // 'imprimir()' que viene declarado como abstracto en la clase Impresion.
    // En este caso, implemento la versión específica para impresiones a COLOR.
    @Override
    public void imprimir(Foto[] fotos) {
        // Muestra en consola el tipo de impresión que se va a realizar.
        System.out.println("Imprimiendo fotos a COLOR:");

        // Recorro el arreglo de fotos usando un bucle for-each.
        // Por cada foto, muestro el nombre del archivo y el indicador [color].

        // Este método recorre las fotos recibidas y simula que se imprimen en color,
        // mostrando por consola el resultado de cada una.
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero() + " [color]");
        }
    }
}
