package ClasesGenericas.ejercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Escribe una interfaz genérica Operable, que sea genérica y que declare las cuatro operaciones básicas: suma, resta,
        producto y división.

        Como puede hacerse
        Se escribe la interfaz Operable, con  un tipo genérico E. Todos los métodos de esta interfaz reciben un objeto de tipo E y
        devuelven un objeto de tipo E.
        De esta manera, se opera el objeto que llame al método con el que se recibe por parámetro y se devuelve el resultado. Ambos, operandos
        y el resultado,son del mismo tipo.

         */

        System.out.println("ingrese los valores de x e y");

        System.out.println("X:");
        double x = scanner.nextInt();
        System.out.println("Y:");
        double y = scanner.nextInt();

        Calculadora calcular = new Calculadora(x, y);

        System.out.println("Las opciones son 1 sumar 2 restar 3 dividir y 4 multiplicar");
        int i = scanner.nextInt();
        switch (i) {

            case 1:
                calcular.suma();
                break;
            case 2:
                calcular.resta();
                break;
            case 3:
                calcular.Division();
                break;
            case 4:
                calcular.producto();
                break;

            default:
                System.out.println("esa opcion no es valida lo siento");
                break;

        }


        /*
        Se desea implementar una clase ClasesGenericas.Almacen que pueda almacenar elementos de cualquier tipo que sean superclases de ClasesGenericas.Producto.
        Esta clase debe tener un método para añadir elementos al almacén y otro método para imprimir los elementos almacenados.

        Implementa el método imprimirElementos de la clase ClasesGenericas.Almacen utilizando un comodín <? super T> para permitir imprimir
        una lista de elementos sin importar el tipo específico.

         */
/*
        Almacen<Producto> almacen = new Almacen<>();

        Producto producto = new Producto("leche",11.50);

        almacen.addProducto(producto);
        almacen.imprimirElementos();
*/



    }
}