import java.util.Arrays;

public class Pruebacopiar {
    public static void main(String[] args) {
        int[] arrayoriginal = {1,2,3,4,5,6,7};
        int posicion = Arrays.binarySearch(arrayoriginal, 3);
        int[] sacar = new int[arrayoriginal.length - 1];

        // Quitar un numero de un array
        System.arraycopy(arrayoriginal, 0, sacar, 0, posicion); // copias hasta la posicion del array que quieres borrar
        System.arraycopy(arrayoriginal, posicion + 1, sacar, posicion, arrayoriginal.length - posicion - 1); // copias despues de la posicion
        System.out.println(Arrays.toString(sacar));

        // Añadir elementos
        // En caso de querer añadirlo en orden seria con un bucle for en el que meteriamos el numero que queremos y cuando haya un numero mayor al que metimos ese seria la posicion
        // insertamos en medio y quedaria igual
        int[] añadir = new int [sacar.length+1]; // creamos otro array con 1 tamaño mas para añadir
        System.arraycopy(sacar, 0, añadir, 0, posicion); // copiar primera parte
        añadir[posicion] = 8; // añadimos el numero en la posicion que quitamos
        System.arraycopy(sacar, posicion, añadir, posicion+1, sacar.length-posicion); // copiamos a partir de la posicion del numero que metimos +1

        System.out.println(Arrays.toString(añadir));
    }
}
