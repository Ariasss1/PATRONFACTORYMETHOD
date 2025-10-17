public abstract class CreadorImpresion {

    // Este método abstracto define el "método fábrica" (Factory Method).
    // Su función es declarar qué tipo de impresión se va a crear,
    // pero sin especificar la clase concreta (Color o Blanco y Negro).
    // Aquí defino el método abstracto que me permite
    // crear diferentes tipos de impresión sin depender directamente de las clases hijas.
    public abstract Impresion crearImpresion();

    // Este método no es abstracto, sino que contiene la lógica general del creador.
    // 'generarImpresion' crea un objeto de tipo Impresion (usando el método fábrica)
    // y luego llama al método 'imprimir' de ese objeto para realizar la acción.
    //
    // En otras palabras: esta clase define "qué se hace" (crear e imprimir),
    // pero deja a las subclases decidir "cómo se crea" la impresión.
    //
    // Aquí centralizo el proceso de generar una impresión:
    // primero la creo con el método fábrica y luego la uso para imprimir las fotos."
    public void generarImpresion(Foto[] fotos) {
        Impresion imp = crearImpresion(); // se delega la creación a la subclase
        imp.imprimir(fotos); // se ejecuta la impresión según el tipo creado
    }
}
