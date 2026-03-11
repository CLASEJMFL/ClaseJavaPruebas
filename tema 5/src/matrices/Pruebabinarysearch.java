import java.util.Arrays;

public class Pruebabinarysearch {
    public static void main(String[] args) throws Exception {
        String [] alumnos = {"Paco","Maria","Luis","Rosa"};
        int posicion = java.util.Arrays.binarySearch(alumnos, "Rosa");
        System.out.println(Arrays.toString(alumnos));
        System.out.println("Encontrado en posicion: " + posicion);
        java.util.Arrays.sort(alumnos);
        System.out.println("Array ordenado:" + Arrays.toString(alumnos));
    }
}
