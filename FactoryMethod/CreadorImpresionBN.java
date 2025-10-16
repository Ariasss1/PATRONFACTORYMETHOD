public class CreadorImpresionBN extends CreadorImpresion {

    @Override
    public Impresion crearImpresion() {
        return new ImpresionBlancoNegro();
    }
}
