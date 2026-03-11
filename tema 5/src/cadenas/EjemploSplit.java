public class EjemploSplit {
    public static void main(String[] args) {
        // Datos simulados de un archivo csv (Producto;Cantidad;Precio)
        String lineaFichero = "Monior Samsung;15;199.99";

        // Llamamos al método para procesar la línea
        String[] datos = procesarLinea(lineaFichero);

        // Mostramos el resultado
        System.out.println("\nDatos extraídos:");
        for (int i = 0;i<datos.length;i++){
            System.out.println("Posicion ["+i+"]: "+datos[i]);
        }
    }
    /**
     * Utiliza split para dividir la cadena cada vez que encuentre un ";"
     * @param cadena
     * @return
     */
    private static String[] procesarLinea(String cadena) {
        // El método split devuelve un array de Strings
        // En este caso el "regex" es simplemente el carácter ";"
        return cadena.split(";");
    }
}
