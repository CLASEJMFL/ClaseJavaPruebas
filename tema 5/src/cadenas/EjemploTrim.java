public class EjemploTrim {
    public static void main(String[] args) {
        String cadena = "  Esta es una cadena    ";
        System.out.println(cadena.trim());
        System.out.println(cadena.toLowerCase());
        System.out.println("Caracter en posicion 3: "+cadena.charAt(3));

        String copiaCadena = cadena;
        System.out.println("cadena --> "+cadena);
        System.out.println("copiaCadena --> "+copiaCadena);
        System.out.println("cadena == copiacadena) --> "+(cadena.equals(copiaCadena)));
        System.out.println();

        cadena = cadena.replace("cadena", "cadena de caracteres");

        System.out.println("cadena --> "+cadena);
        System.out.println("copiaCadena --> "+copiaCadena);
        System.out.println("cadena == copiaCadena --> "+(cadena==copiaCadena));
        System.out.println("cadena.equals(copiacadena)--> "+(cadena.equals(copiaCadena)));


    }
}
