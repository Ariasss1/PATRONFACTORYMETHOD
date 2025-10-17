public class Camara {
    // Atributos privados que representan las características principales de la cámara.
    // 'marca' y 'modelo' permiten identificar con qué tipo de cámara se tomó la foto.
    private String marca;
    private String modelo;

    //Cada vez que creo una cámara, le doy su marca y modelo,
    // para luego poder identificar con qué dispositivo se tomaron las fotos.
    public Camara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método 'snap': simula tomar una fotografía.
    // Recibe como parámetro el nombre del archivo (nombreFichero) que tendrá la foto.
    // Muestra un mensaje por consola con la marca y modelo de la cámara que tomó la foto,
    // y devuelve un nuevo objeto de tipo 'Foto' con el nombre que le dimos.
    public Foto snap(String nombreFichero) {
        System.out.println("Foto tomada con cámara " + marca + " " + modelo);
        return new Foto(nombreFichero); // Aquí se crea y retorna la foto capturada.
    }
}
