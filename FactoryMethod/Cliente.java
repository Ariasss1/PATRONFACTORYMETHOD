public class Cliente {
    // Atributos privados que identifican al cliente.
    // 'cedula' sirve como documento o identificador único.
    // 'nombre' guarda el nombre del cliente que hace los pedidos.
    private String cedula;
    private String nombre;

    //Este constructor inicializa los datos básicos
    // del cliente que va a realizar un pedido dentro del sistema.
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    //El método getNombre me permite acceder al nombre
    // del cliente sin exponer directamente el atributo privado."
    public String getNombre() {
        return nombre;
    }
}
