public class ProblemaDividir {
    public static void main(String[] args) {
        int numerador = 10;
        int[] denominadores = {2, 0, 5};

        for (int den : denominadores){
            System.out.println("--- Intentando dividir "+numerador+" entre "+den+" ---");
            
            // EL BLOQUE TRY: contiene el codigo que puede lazar una excepcion
            try {
                int resultado = numerador/den;
                System.out.println("El resultado es: "+resultado);
            } catch (ArithmeticException e) {
                System.out.println("¡ERROR! No es posible dividir entre cero.");
                // e.printStackTrace(); // Descomenta esta línea para ver el rastro de la pila
            }
            System.out.println("Esta línea siempre se ejecuta después del try-catch.");
        }
        System.out.println("\nEl programa ha finalizado correctamente, a pesar de los errores.");
    }
}
