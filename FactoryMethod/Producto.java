public class Producto {
    // Atributo 'numero' identifica cada producto dentro del pedido.
    // Sirve para numerar o distinguir los diferentes tipos de impresión solicitados.
    private int numero;

    // 'creador' es una referencia a la clase abstracta CreadorImpresion.
    // Gracias a esto, el producto no necesita saber si se trata de una impresión a color
    // o en blanco y negro. Solo llama al creador para que se encargue de fabricar la impresión.
    // Aquí se aplica el patrón Factory Method.
    private CreadorImpresion creador;

    // Constructor: inicializa el número de producto y el tipo de creador (color o blanco/negro).
    // Cada producto tiene un identificador y un creador que sabe cómo generar
    // el tipo de impresión correspondiente.
    public Producto(int numero, CreadorImpresion creador) {
        this.numero = numero;
        this.creador = creador;
    }

    // Método 'procesarImpresion': representa la acción de generar las impresiones del producto.
    // Primero muestra un mensaje identificando el producto, y luego usa el método del creador
    // para generar las impresiones.
    //
    // Aquí se ve claramente el patrón Factory Method en acción:
    // el producto no crea directamente la impresión, sino que delega esa tarea al creador."
    public void procesarImpresion(Foto[] fotos) {
        System.out.println("\nProducto #" + numero + " generando impresión...");
        creador.generarImpresion(fotos); // delega la creación al creador de impresiones
    }
}
