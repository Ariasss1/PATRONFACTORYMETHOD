public class ElJefe {
    public static void main(String[] args) {

        // Crear cámara y tomar fotos
        Camara cam = new Camara("Canon", "EOS R10");
        Foto[] fotos = {
            cam.snap("cumpleaños1.jpg"),
            cam.snap("cumpleaños2.jpg"),
            cam.snap("familia.jpg")
        };

        // Crear productos con diferentes tipos de impresión
        Producto p1 = new Producto(101, new CreadorImpresionColor());
        Producto p2 = new Producto(102, new CreadorImpresionBN());

        // Crear cliente
        Cliente cli = new Cliente("1062204187", "Andrés Felipe Cañaveral");

        // Crear pedido con tarjeta y precio por foto
        Pedido pedido = new Pedido(cli, new Producto[]{p1, p2}, 492312345, 1500.0);

        // Procesar pedido
        pedido.procesarPedido(fotos);
    }
}
