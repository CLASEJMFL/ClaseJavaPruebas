public class Prueba {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Prueba con index of: ");
        String email = "usuario.ejemplo@gmail.com";
        extraerdominion(email);
        System.out.println("========================================");
        String prueba = ("Prueba con espacios");
        System.out.println("Prueba empty: "+prueba.isEmpty());
        System.out.println("Prueba length: "+prueba.length());
        System.out.println("========================================");
        System.out.println("Prueba compareTo");
        String referencia1 = "Paco";
        String contraste1 = "Antonio";
        int prueba1 = (referencia1.compareTo(contraste1));
        System.out.println(prueba1);
        
    }

    private static void extraerdominion(String correo) {
        // Buscamos la posicoion del caracter @
        int indiceArroba = correo.indexOf("@");
        String nuevacadena = correo.substring(0, indiceArroba);
        System.out.println(nuevacadena);
        // Si indexof devuelve -1. significa que no a encotnrado la cadena
        if (indiceArroba != -1) {
            System.out.println("La @ se encuentra en el indice: " + indiceArroba);

            // usamos el indice encontrado apra extraer loq ue viene despues
            String dominio = correo.substring(indiceArroba + 1 );
            System.out.println("El dominio del correo es: " + dominio);
        } else {
            System.out.println("Error: el correo no es valido por que falta un @");
        }
        String palabra = "Programacion";
        int posicion = palabra.indexOf("Java");
        System.out.println("\nBuscando 'Java' en '" + palabra + "': " + posicion);
    }
}
