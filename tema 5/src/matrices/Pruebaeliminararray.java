import java.util.Arrays;
import java.util.Random;

public class Pruebaeliminararray {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        int ran = rd.nextInt(original.length);
        System.out.println("aleatorio = "+ran);
        int pos = ran;
        System.out.println("posicion = "+pos);
       
        // ---- ELIMINAR ELEMENTO ----
        int[] quitar = new int[original.length - 1];

        System.arraycopy(original, 0, quitar, 0, pos);
        System.arraycopy(original, pos + 1, quitar, pos, original.length - pos -1);

        System.out.println("Array sin elemento:");
        System.out.println(Arrays.toString(quitar));

        // ---- AÑADIR ELEMENTO EN EL MEDIO ----
        int[] añadir = new int[quitar.length + 1];
        System.arraycopy(quitar, 0, añadir, 0, pos);
        añadir[pos] = 8;
        System.arraycopy(quitar, pos, añadir, pos + 1, quitar.length - pos);
        System.out.println("Array con elemento añadido:");
        System.out.println(Arrays.toString(añadir));

        // --- COPIAR CON RANGE ---
        int[] parte1 = Arrays.copyOfRange(original, 0, pos);

        // copiar después del 4
        int[] parte2 = Arrays.copyOfRange(original, pos , original.length);

        // unir
        int[] resultado = new int[parte1.length + parte2.length];
        System.arraycopy(parte1, 0, resultado, 0, parte1.length);
        System.arraycopy(parte2, 0, resultado, parte1.length, parte2.length);

        System.out.println(Arrays.toString(resultado));
    }
}