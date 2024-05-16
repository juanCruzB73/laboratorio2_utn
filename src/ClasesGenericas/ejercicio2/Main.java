package ClasesGenericas.Ejercicio2;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        // Crear una pila con un tamaño máximo de 5 elementos
        PilaArray<Integer> pila = new PilaArray<>(5);

        // Añadir elementos a la pila
        System.out.println("Añadiendo elementos a la pila:");
        for (int i = 1; i <= 5; i++) {
            pila.add(i);
            System.out.println("Añadido: " + i);
        }
        // Mostrar la pila
        System.out.println("Contenido de la pila: " + pila);

        // Extraer elementos de la pila
        System.out.println("Extrayendo elementos de la pila:");
        while (!pila.isEmpty()) {
            System.out.println("Extraído: " + pila.extraer());
        }

        // Intentar extraer de una pila vacía (debería lanzar una excepción)
        try {
            pila.extraer();
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
