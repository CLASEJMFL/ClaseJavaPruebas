import java.util.Arrays;

public class Pruebarellenar {
    public static void main(String[] args) {
        int [] [] array = new int [3] [6];
        java.util.Arrays.fill(array[1],1);
        java.util.Arrays.fill(array[2],2);
        System.out.println("Array[0]: " + Arrays.toString(array[0]));
        System.out.println("Array[1]: " + Arrays.toString(array[1]));
        System.out.println("Array[2]: " + Arrays.toString(array[2]));
    }
}
