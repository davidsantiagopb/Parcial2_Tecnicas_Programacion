import java.text.NumberFormat;
import java.util.Locale;

/**
 * Clase para los productos que se ofrecen.
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private String cantidad;
    private double precio;

    /**
     * Constructor de la clase.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Producto(String nombre, String talla, String color, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Método referente a los precios de los productos
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getPrecio() {
        NumberFormat precios = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Formatear el precio en formato colombiano
        String precioFormateado = precios.format(this.precio);
        return precioFormateado;
    }

    /**
     * Método que muestra los atributos de los productos eléctronicos
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + getPrecio());
    }
}