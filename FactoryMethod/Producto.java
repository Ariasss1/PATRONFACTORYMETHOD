public class Producto {
    private int numero;
    private CreadorImpresion creador;

    public Producto(int numero, CreadorImpresion creador) {
        this.numero = numero;
        this.creador = creador;
    }

    public void procesarImpresion(Foto[] fotos) {
        System.out.println("\nProducto #" + numero + " generando impresión...");
        creador.generarImpresion(fotos);
    }
}
