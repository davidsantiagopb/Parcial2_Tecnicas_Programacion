/**
 * Clase Computador que hereda de Productos.
 */
class Computador extends Producto {
        private boolean mangaLarga;

        /**
         * Constructor del computador
         *
         * Complejidad temporal: O(1) Tiempo constante.
         */
        public Computador(String nombre, String descripcion, String cantidad, double precio) {
                super(nombre, descripcion, cantidad, precio);
                this.Computador = Computador;
        }

        }
}