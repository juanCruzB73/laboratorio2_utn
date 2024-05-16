package ClasesGenericas;

import java.util.ArrayList;
import java.util.List;
public class Almacen<T>{

    private List<T> productos;

    public Almacen(){

       this.productos = new ArrayList<>();

    }

    public void addProducto(T producto){

        productos.add(producto);

    }

    public void imprimirElementos(){

        for (T producto : productos ){

            System.out.println(producto);

        }

    }


/*
public static void agregarProducto(List<ClasesGenericas.Producto> carrito,String nombre,double precio){

}

*/

}