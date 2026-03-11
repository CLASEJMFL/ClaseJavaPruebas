public class EjemploReplace {
    public static void main(String[] args) {
        String rutaWindows = "C:\\Usuarios\\Documentos\\Java\\Proyecto.java";

        System.out.println("Ruta original (Windows): " + rutaWindows);

        // Llamamos al método para normalizar la ruta
        String rutaWeb = normalizarRuta(rutaWindows);

        System.out.println("Ruta normalizada (Web/Linux): "+ rutaWeb);
    }

    private static String normalizarRuta(String rutaOriginal) {
        // Sustituimos \\ por una barra inclinada /
        return rutaOriginal.replace("\\","/");
    }
}