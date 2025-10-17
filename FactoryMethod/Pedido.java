import java.util.Date;

public class Pedido {
    // Atributos principales del pedido:
    // 'cliente' → representa a la persona que realiza la compra.
    // 'productos' → lista de productos (tipos de impresión) que el cliente solicitó.
    // 'fecha' → se guarda la fecha y hora en que se genera el pedido.
    // 'numeroTarjetaCredito' → simula el método de pago con tarjeta.
    // 'precioPorFoto' → define cuánto vale cada foto.
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;
    private double precioPorFoto;

    // Constructor: inicializa todos los datos del pedido.
    // Cuando se crea un pedido, se guarda el cliente, los productos que pidió,
    // la tarjeta con la que paga, y el valor por cada foto.
    //
    // En la exposición puedes decir:
    // "Este constructor arma toda la información del pedido, incluyendo la fecha actual
    // y los datos del cliente y sus productos."
    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito, double precioPorFoto) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = new Date(); // asigna automáticamente la fecha del sistema
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.precioPorFoto = precioPorFoto;
    }

    // Método principal que procesa el pedido completo.
    // Calcula el total a pagar, muestra una "factura" con los datos del pedido,
    // y luego ordena a cada producto que realice su impresión.
    //
    // Aquí se ejecuta todo el flujo: primero se calcula el total, se imprime la factura,
    // y después se llama a cada producto para que genere las impresiones correspondientes.
    public void procesarPedido(Foto[] fotos) {
        // Cálculo del total: número de fotos × precio por foto × número de productos.
        double total = fotos.length * precioPorFoto * productos.length;

        // Impresión de la factura del pedido.
        System.out.println("\n--------------------------------------");
        System.out.println("PEDIDO DE IMPRESIÓN - FACTURA DE COMPRA");
        System.out.println("--------------------------------------");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        // Se muestran solo los últimos 4 dígitos de la tarjeta por seguridad.
        System.out.println("Número de tarjeta: **** **** **** " + (numeroTarjetaCredito % 10000));
        System.out.println("Precio por foto: $" + precioPorFoto);
        System.out.println("Cantidad de fotos: " + fotos.length);
        System.out.println("Número de productos: " + productos.length);
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("--------------------------------------\n");

        // Llamada a cada producto para que procese su tipo de impresión.
        for (Producto p : productos) {
            p.procesarImpresion(fotos);
        }

        // Mensaje final de confirmación.
        System.out.println("\n✅ Pedido completado exitosamente. ¡Gracias por su compra!");
    }
}
