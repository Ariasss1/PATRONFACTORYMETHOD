public class CreadorImpresionBN extends CreadorImpresion {

    // Con esta anotación @Override indico que estoy sobrescribiendo
    // el método abstracto 'crearImpresion()' de la clase padre (CreadorImpresion).
    // Aquí defino qué tipo de impresión voy a crear en este caso concreto:
    // una impresión en blanco y negro.
    //
    //Esta subclase concreta implementa el método del Factory Method.
    // Su responsabilidad es crear objetos del tipo ImpresionBlancoNegro.
    @Override
    public Impresion crearImpresion() {
        // Aquí devuelvo una nueva instancia de la clase concreta 'ImpresionBlancoNegro'.
        // Así se aplica el principio del patrón: el código general llama a 'crearImpresion()',
        // pero no sabe ni le importa qué tipo de impresión se está creando.
        return new ImpresionBlancoNegro();
    }
}
