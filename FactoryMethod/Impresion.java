public abstract class Impresion {
    // Atributo protegido: 'color' indica el tipo de impresión (por ejemplo, "Color" o "Blanco y Negro").
    // Lo declaro como 'protected' para que las subclases (ImpresionColor e ImpresionBlancoNegro)
    // puedan acceder a él directamente.
    //
    // Este atributo guarda el tipo de impresión y se usa para diferenciar
    // el comportamiento entre las clases hijas.
    protected String color;

    // Método abstracto 'imprimir': define lo que todas las impresiones deben hacer,
    // pero sin especificar cómo lo harán.
    //
    // En este caso, cada subclase va a implementar su propia forma de imprimir las fotos.
    // Por ejemplo: una imprimirá en color y la otra en blanco y negro.
    //
    // Aquí defino la acción principal del sistema, que es imprimir.
    // No la implemento aquí porque depende del tipo de impresión,
    // y esa lógica la manejarán las subclases concretas.
    public abstract void imprimir(Foto[] fotos);
}
