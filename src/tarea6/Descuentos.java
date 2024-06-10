/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author pjust
 */
public class Descuentos {

    private static final int OTRO_MINIMO_PARA_DESCUENTO = 50;
    private static final int DINERO_A_DESCONTAR = 5;
    private static final int MINIMO_PARA_DESCUENTO = 3;
    private static final double OTRO_DESCUENTO = 0.95;
    private static final double DESCUENTO_PRODUCTO = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > MINIMO_PARA_DESCUENTO) {
            precioProducto -= DINERO_A_DESCONTAR;
        }
        if (numProductos != OTRO_MINIMO_PARA_DESCUENTO) {
            total = precioProducto * DESCUENTO_PRODUCTO;
            mostraTotal(total);
        } else {
            total = precioProducto * OTRO_DESCUENTO;
            mostraTotal(total);
        }

    }


    private void mostraTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
