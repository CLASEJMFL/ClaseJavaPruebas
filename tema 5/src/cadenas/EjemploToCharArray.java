public class EjemploToCharArray {
    public static void main(String[] args) {
        String original = "Supercalifragilistico";

        // Mostrar el original
        System.out.println("Original: "+original);

        // Salida cambiando vocales por *
        System.out.println("Cambiado = "+original.replaceAll("[aeiou]","*"));

    }
}
