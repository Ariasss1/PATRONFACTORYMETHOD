import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;
    private double precioPorFoto;

    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito, double precioPorFoto) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = new Date();
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.precioPorFoto = precioPorFoto;
    }

    public void procesarPedido(Foto[] fotos) {
        double total = fotos.length * precioPorFoto * productos.length;

        System.out.println("\n--------------------------------------");
        System.out.println("PEDIDO DE IMPRESIÓN - FACTURA DE COMPRA");
        System.out.println("--------------------------------------");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: **** **** **** " + (numeroTarjetaCredito % 10000));
        System.out.println("Precio por foto: $" + precioPorFoto);
        System.out.println("Cantidad de fotos: " + fotos.length);
        System.out.println("Número de productos: " + productos.length);
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("--------------------------------------\n");

        for (Producto p : productos) {
            p.procesarImpresion(fotos);
        }

        System.out.println("\n✅ Pedido completado exitosamente. ¡Gracias por su compra!");
    }
}
