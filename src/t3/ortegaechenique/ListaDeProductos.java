/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3.ortegaechenique;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ortega Echenique
 */
public class ListaDeProductos {
    private List<Producto> productos = new ArrayList<>();
    private Map<String, Producto> productosPorCodigo = new HashMap<>();

    public void agregarProducto(String codigo, Producto producto) {
        productosPorCodigo.put(codigo, producto);
    }

    public void mostrarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
            }
        }
    }

    public void mostrarProductoPorCodigo(String codigo) {
        Producto producto = productosPorCodigo.get(codigo);
        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado para el código: " + codigo);
        }
    }
}