package ClasesGenericas.Ejercicio2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int tamañoMaximo) {
        array = (E[]) new Object[tamañoMaximo];
        contador = 0;
    }

    public boolean isEmpty() {
        return contador == 0;
    }

    public boolean add(E elemento) {
        if (contador < array.length) {
            array[contador] = elemento;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public E primero() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        } else {
            return array[contador - 1];
        }
    }

    public E extraer() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        } else {
            contador--;
            return array[contador];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaArray: [");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
