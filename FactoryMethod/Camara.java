public class Camara {
    private String marca;
    private String modelo;

    public Camara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Foto snap(String nombreFichero) {
        System.out.println("Foto tomada con cámara " + marca + " " + modelo);
        return new Foto(nombreFichero);
    }
}
