public class EjemploSubstring {
    public static void main(String[] args) {
        String publicacion = "Hoy es un gran día para programar #Java2026 , ponte con ello.";

        // Queremos extraer solo el hastag (del caracter 35 al final)
        // En este ejemplo, supongamos que sabemos las posiciones exactas
        String hastag = extraerFragmento(publicacion,34,43);

        System.out.println("Texto original: "+ publicacion);
        System.out.println("Fragmento extraido: "+ hastag);
        String[] datos = procesarLinea(publicacion);

        // Ejemplo dinamico: Extraer los primeros 10 caracteres
        String resumen = publicacion.substring(0,10);
        System.out.println("Resumen (0-10): " + resumen + "...");
        String sacardato = sacarHastag(datos);
        System.out.println("Dato = "+sacardato);
        
    }
    private static String sacarHastag(String[] datos) {
        String hastag = "";
        for (int i = 0;i<datos.length;i++) {
            hastag=datos[i];
            if (datos[i].startsWith("#") == true)break;
        }
        return hastag;
    }
    /**
     * Utiliza substring para recortar una parte de la cadena
     * @param texto
     * @param inicio
     * @param fin
     * @return
     */
    private static String extraerFragmento(String texto, int inicio, int fin) {
        // Retorna la subcadena desde 'inicio' hasta fin -1
        return texto.substring(inicio,fin);
    }

    private static String[] procesarLinea(String cadena) {
        // El método split devuelve un array de Strings
        // En este caso el "regex" es simplemente el carácter ";"
        return cadena.split(" ");
    }
}
