// Clase Cliente
class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Dirección: " + direccion;
    }
}

// Clase Pedido
class Pedido {
    private int numeroPedido;
    private String articulo;
    private Cliente cliente;

    public Pedido(int numeroPedido, String articulo, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.articulo = articulo;
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getArticulo() {
        return articulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido #" + numeroPedido + ": Artículo - " + articulo + ", Cliente - " + cliente.getNombre();
    }
}

// Clase Pago
class Pago {
    private int numeroPedido;
    private String metodoPago;
    private double total;

    public Pago(int numeroPedido, String metodoPago, double total) {
        this.numeroPedido = numeroPedido;
        this.metodoPago = metodoPago;
        this.total = total;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pago para Pedido #" + numeroPedido + ": Método - " + metodoPago + ", Total - $" + total;
    }
}

// Clase Notificación
class Notificacion {
    private int numeroPedido;
    private String guia;
    private String fechaEntrega;
    private String correo;

    public Notificacion(int numeroPedido, String guia, String fechaEntrega, String correo) {
        this.numeroPedido = numeroPedido;
        this.guia = guia;
        this.fechaEntrega = fechaEntrega;
        this.correo = correo;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getGuia() {
        return guia;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Notificación Pedido #" + numeroPedido + ": Guía - " + guia + ", Fecha de Entrega - " + fechaEntrega + ", Correo - " + correo;
    }
}

// Clase principal para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "Av. Principal 123");

        // Crear un pedido
        Pedido pedido = new Pedido(1, "Laptop", cliente);

        // Crear un pago
        Pago pago = new Pago(1, "Tarjeta de Crédito", 1200.50);

        // Crear una notificación
        Notificacion notificacion = new Notificacion(1, "1234-5678", "2024-09-15", "juan.perez@example.com");

        // Mostrar información
        System.out.println(cliente);
        System.out.println(pedido);
        System.out.println(pago);
        System.out.println(notificacion);
    }
}