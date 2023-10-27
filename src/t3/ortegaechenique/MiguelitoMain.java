/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ortegaechenique;

/**
 *
 * @author Ortega Echenique
 */
public class MiguelitoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeProductos inventario = new ListaDeProductos();

        Producto producto1 = new ProductoAlimenticio("Manzana", 1.99);
        Producto producto2 = new ProductoElectronico("Smartphone", 599.99);

        inventario.agregarProducto("12345", producto1);
        inventario.agregarProducto("67890", producto2);

        // Mostrar un producto por nombre
        inventario.mostrarProductoPorCodigo("12345"); // Mostrar el producto con el código "12345"
        inventario.mostrarProductoPorCodigo("99999");
        
          PantallaInicio PInicio = new PantallaInicio();
          PInicio.setLocationRelativeTo(null);
          PInicio.setVisible(true);
    }
    
}
