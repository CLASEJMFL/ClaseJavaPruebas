import java.util.Arrays;

public class Pruebaarrayclonado {
    public static void main(String[] args) {
        int array[] = {4,7,14,9};
        int arrayClonado[] = array.clone();
        System.out.println(array == arrayClonado);
        System.out.println(Arrays.toString(arrayClonado));
        System.out.println(Arrays.toString(array));
        arrayClonado[0] = 0;
        System.out.println(Arrays.toString(arrayClonado));
        System.out.println(Arrays.toString(array));
        System.out.println(array [0]);
        System.out.println(arrayClonado [0]);
    }
}
