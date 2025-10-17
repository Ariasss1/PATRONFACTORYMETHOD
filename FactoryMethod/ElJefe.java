public class ElJefe {
    public static void main(String[] args) {

        // 1️⃣ Crear cámara y tomar fotos
        // Aquí instancio una cámara con su marca y modelo.
        // Luego simulo la toma de tres fotos, las cuales se almacenan en un arreglo de tipo Foto.
        // Empiezo creando la cámara que genera las fotos. Cada foto será luego impresa.
        Camara cam = new Camara("Canon", "EOS R10");
        Foto[] fotos = {
            cam.snap("cumpleaños1.jpg"),
            cam.snap("cumpleaños2.jpg"),
            cam.snap("familia.jpg")
        };

        // 2️⃣ Crear productos con diferentes tipos de impresión
        // Cada producto representa un tipo de impresión (Color o Blanco y Negro).
        // Aquí se ve claramente el uso del patrón Factory Method:
        // Cada producto se asocia a un creador distinto (CreadorImpresionColor y CreadorImpresionBN).
        // Factory Method
        // Cada producto tiene su propio creador de impresiones, aplicando el patrón Factory Method.
        Producto p1 = new Producto(101, new CreadorImpresionColor());
        Producto p2 = new Producto(102, new CreadorImpresionBN());

        // 3️⃣ Crear cliente
        // Aquí se crea el cliente que realiza el pedido, con su cédula y nombre.
        // Este cliente es quien hace el pedido y paga las impresiones.
        Cliente cli = new Cliente("1062204187", "Andrés Felipe Cañaveral");

        // 4️⃣ Crear pedido con los productos, el cliente, la tarjeta y el precio por foto
        // En este punto se arma el pedido completo: se le pasan el cliente, los productos,
        // el número de tarjeta (simulado) y el valor por cada foto.
        // Aquí se crea el pedido que une al cliente, sus productos y los datos de pago.
        Pedido pedido = new Pedido(cli, new Producto[]{p1, p2}, 492312345, 1500.0);

        // 5️⃣ Procesar el pedido
        // Finalmente, se ejecuta todo el flujo: se imprime la factura,
        // se calculan los valores y se generan las impresiones usando el patrón Factory Method.
        // Al ejecutar este método, el sistema procesa las fotos,
        // calcula el total y muestra cómo se imprimen las imágenes según el tipo de impresión.
        pedido.procesarPedido(fotos);
    }
}
