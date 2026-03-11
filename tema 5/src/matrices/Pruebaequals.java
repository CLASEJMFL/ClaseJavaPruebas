public class Pruebaequals {
    public static void main(String[] args) {
    int array1[] = {4,7,14,9};
    int array2[] = array1;
    int arrayClonado[] = array1.clone();
    System.out.println(array1 == arrayClonado);
    System.out.println(array1 == array2);
    System.out.println(java.util.Arrays.equals(array1, arrayClonado));
    }
}