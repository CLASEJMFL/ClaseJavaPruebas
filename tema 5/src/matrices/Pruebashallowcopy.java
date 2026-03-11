public class Pruebashallowcopy {
    public static void main(String[] args) {
        int array [] [] = {{2,5,24,15,4},{36,1,87,0,12},{89,3,35,7,24}};
        int arrayClonado [] [] = array.clone();
        System.out.println(array == arrayClonado);
        System.out.println(array [1] [2]);
        arrayClonado [1] [2] = 44;
        System.out.println(array [1] [2]);
        System.out.println(arrayClonado [1] [2]);
    }
}
