public class CreadorImpresionColor extends CreadorImpresion {

    @Override
    public Impresion crearImpresion() {
        return new ImpresionColor();
    }
}
