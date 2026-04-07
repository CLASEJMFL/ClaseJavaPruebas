import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProblemaLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo_inexistente.txt"; // Un archivo que no vamos a crear
        BufferedReader lector = null;

        System.out.println("Itentando abrir el archivo: "+nombreArchivo);

        try {
            // Esta línea lanza una FileNotFoundException (Checked Exception)
            lector = new BufferedReader(new FileReader(nombreArchivo));

            String linea = lector.readLine();
            System.out.println("La primera línea es: "+linea);
        } catch (FileNotFoundException e) {
            System.err.println("¡ERROR! El archivo '"+nombreArchivo+"' no pudo ser encontrado.");
        } catch (IOException e) {
            System.err.println("Hubo un problema de E/S al leer el archivo.");
            e.printStackTrace();
        } finally {
            System.out.println("--- Ejecutando el bloque finally ---");
            try {
                // Es vital cerrar los archivos abiertos
                if (lector != null){
                    lector.close();
                    System.out.println("Recurso 'lector' cerrado con éxito");
                } else {
                    System.out.println("El 'lector' cerrado con éxito.");
                }
            } catch (IOException e){
                System.err.println("Error critico al intentar cerrar el lector.");
            }
        }
        System.out.println("\nEl progama continua despues de intentar leer el archivos");
    }
}
