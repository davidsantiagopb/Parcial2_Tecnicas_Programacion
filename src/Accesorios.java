/**
 * Clase Accesorios que hereda de Productos.
 */
class Accesorios extends Producto {

    /**
     * Constructor de los accesorios
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public telefono(String nombre, String descripcion, String cantidad, double precio) {
        super(nombre, descripcion, cantidad, precio);
        this.accesorios = accesorios;
    }

}
