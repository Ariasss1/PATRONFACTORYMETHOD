public class ImpresionBlancoNegro extends Impresion {

    @Override
    public void imprimir(Foto[] fotos) {
        System.out.println("Imprimiendo fotos en BLANCO Y NEGRO:");
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero() + " [B/N]");
        }
    }
}
