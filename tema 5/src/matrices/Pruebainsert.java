import java.util.Arrays;

public class Pruebainsert {

    public static void Pruebainsert() {
        // Arrays de ejemplo
        int[] original = {1, 2, 3, 4, 5};
        int[] insertar = {8, 9, 10};
        int posicion = 3;

        // Crear nuevo array con tamaño suficiente
        int[] nuevo = new int[original.length + insertar.length];

        // Copiar la parte antes de la posición
        System.arraycopy(original, 0, nuevo, 0, posicion);

        // Copiar el array a insertar
        System.arraycopy(insertar, 0, nuevo, posicion, insertar.length);

        // Copiar la parte después de la posición
        System.arraycopy(original, posicion, nuevo, posicion + insertar.length,original.length - posicion);

        // Mostrar resultado
        System.out.println(Arrays.toString(nuevo));
    }

    public static void main(String[] args) {
        Pruebainsert(); // Llamada al método
    }
}
