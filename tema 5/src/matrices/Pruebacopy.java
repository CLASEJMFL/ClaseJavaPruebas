import java.util.Arrays;

public class Pruebacopy {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = Arrays.copyOfRange(a, 0,a.length);
        int [] c = Arrays.copyOfRange(a, a.length-2, a.length);
        int [] d = Arrays.copyOf(a, a.length);
        int [] e = Arrays.copyOf(a, 2);
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("Array c: " + Arrays.toString(c));
        System.out.println("Array d: " + Arrays.toString(d));
        System.out.println("Array e: " + Arrays.toString(e));
    }
}