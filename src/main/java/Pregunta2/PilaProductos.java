/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author USUARIO
 */
public class PilaProductos {

    private boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class Nodo {

        Productos productos;
        Nodo siguiente;

        public Nodo(Productos productos) {
            this.productos = productos;
            this.siguiente = null;

        }
    }

    private Nodo primero;

    public PilaProductos() {
        primero = null;
    }

    public boolean esVacía() {
        return primero == null;

    }

    public void apilar(Productos productos) {
        Nodo nuevo = new Nodo(productos);
        nuevo.siguiente = primero;
        primero = nuevo;
    }

    public Productos eliminar() {
        if (esVacia()) {
            System.out.println("no se puede eliminar una lista vacía");
        }
        return null;
    }

    public Productos imprimir() {
        if (esVacia()) {
            System.out.println("no se puede imprimir lista vacia");
        }
        Nodo primero = null;
        Nodo actual = primero;
        System.out.println("productos en la lista: ");
        while (actual != null) {
            Productos p = actual.productos;
            System.out.println("Codigo del producto: " + p.getCodiProd()
                    + "nombre del producto: " + p.getNombProd()
                    + "Precio del producto: " + p.getPrecProd()
                    + "Cantidad de productos: " + p.getCantProd()
                    + "costo de producto: " + p.getCostoProd());

        }
        return null;
    }
    public Productos promedio(){
        if(esVacia()){
            System.out.println("ingrese al menos dos productos para sacarle promedio");
        }
        else {
            
        }
        return null;
    }

}
