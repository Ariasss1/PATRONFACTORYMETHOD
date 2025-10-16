public class ImpresionColor extends Impresion {

    @Override
    public void imprimir(Foto[] fotos) {
        System.out.println("Imprimiendo fotos a COLOR:");
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero() + " [color]");
        }
    }
}
