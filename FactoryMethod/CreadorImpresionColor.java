public class CreadorImpresionColor extends CreadorImpresion {

    // La anotación @Override indica que estoy sobrescribiendo el método
    // 'crearImpresion()' que viene definido en la clase abstracta CreadorImpresion.
    // En este caso, esta clase se encarga de crear impresiones a COLOR.
    //
    // Esta subclase concreta implementa el método fábrica para devolver
    // un tipo específico de impresión, en este caso a color."
    @Override
    public Impresion crearImpresion() {
        // Aquí aplico el patrón Factory Method:
        // Retorno una nueva instancia de la clase concreta 'ImpresionColor'.
        // De esta forma, el sistema no necesita saber cómo se crea,
        // solo que debe pedir al creador que la genere.
        return new ImpresionColor();
    }
}
