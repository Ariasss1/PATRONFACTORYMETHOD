public abstract class CreadorImpresion {

    public abstract Impresion crearImpresion();

    public void generarImpresion(Foto[] fotos) {
        Impresion imp = crearImpresion();
        imp.imprimir(fotos);
    }
}
