package ed.u06.ra04.tarea6edclase;

/**
 *
 * @author Jairo Sánchez Ballesteros 
 */
public class Tarea6EDClase {
    private static final double VEINTE_PORCIENTO = 0.8;
    private static final double CINCO_PORCIENTO = 0.95;
    private static final int MINIMOPARA_DESCUENTODIRECTO = 3;
    private static final int DESCUENTO_DIRECTO = 5;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > MINIMOPARA_DESCUENTODIRECTO) {
            precioProducto -= DESCUENTO_DIRECTO;
        }
        if (numProductos != 0) {
            aplicarPorcentaje(precioProducto, VEINTE_PORCIENTO);
        } else {
            aplicarPorcentaje(precioProducto, CINCO_PORCIENTO);
        }
    }
    
    private void aplicarPorcentaje(double precioProducto, double porcentajeAplicado) {
        double total;
        total = precioProducto * porcentajeAplicado;
        System.out.println("El total a pagar es: " + total);
    }
}


