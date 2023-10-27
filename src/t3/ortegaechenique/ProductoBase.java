/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3.ortegaechenique;

/**
 *
 * @author USER
 */
public abstract class ProductoBase implements Producto {
    private String nombre;
    private double precio;

    public ProductoBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}

