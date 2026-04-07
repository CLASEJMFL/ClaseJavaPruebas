import java.io.FileReader;
import java.io.IOException;

public class Prueba1 {
    public static void main(String[] args) throws Exception {
        try {
            try (FileReader file = new FileReader("archivo_inexistente.txt")) {
            }
        } catch (IOException e) {
            System.out.println("Error: El archivo no existe o no se pudo abrir"+e.getMessage());
        }
    }
}
