public class Foto {
    // Atributo privado que guarda el nombre del archivo o la ruta de la foto.
    // Este atributo identifica la imagen que se va a imprimir o mostrar.
    private String fichero;

    // Constructor: recibe el nombre del archivo (por ejemplo "foto1.jpg") y lo guarda.
    // Cada objeto Foto representa una imagen individual.
    // Cuando se crea, se le asigna un nombre de fichero que luego se usa al imprimir."
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Método getter: devuelve el nombre del fichero.
    // Es útil cuando otras clases (como Impresion o Pedido) necesitan saber qué foto imprimir.
    // Este método permite acceder al nombre de la foto sin modificar directamente el atributo."
    public String getFichero() {
        return fichero;
    }

    // Método print: simula mostrar la foto en pantalla o procesarla para imprimirla.
    // Muestra un mensaje con el nombre del archivo de la foto.
    // En la exposición puedes decir:
    // "Este método es solo una simulación visual que me permite ver qué foto se está usando."
    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }
}
