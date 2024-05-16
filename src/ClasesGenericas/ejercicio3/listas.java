package ClasesGenericas.ejercicio3.Util;
import ClasesGenericas.ejercicio3.Producto;

import java.util.List;
public class listas {
    public static void showList(List<? extends Producto>list){
        for(Object element: list){
            System.out.println(element);
        }
    }
    public static void addToList(List<? super Producto> list,String name,double price){
        Producto product=new Producto(name,price);
        list.add(product);
    }
}
