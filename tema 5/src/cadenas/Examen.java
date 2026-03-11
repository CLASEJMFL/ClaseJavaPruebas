public class Examen {
    public static void main(String[] args) {
        String s = "Andalucía";
        System.out.println("1 ->> "+s.charAt(3));

        String texto = "Java";
        texto.toUpperCase();
        System.out.println("2 ->> "+texto);

        s = "Hola";
        System.out.println("3 ->> "+s);

        String frase = "Aprender Java";
        String sub = frase.substring(9, 13);
        System.out.println("4 ->> "+sub);

        String s1 = "DAW";
        String s2 = "daw";
        System.out.println("5 ->> "+s1.equalsIgnoreCase(s2));

        s = "  Hola  ";
        String r = s.trim();
        System.out.println("6 ->> "+r);

        String a = "a";
        String b = "A";
        if (a.compareTo(b) == 0) {
            System.out.println("7 --> Si");
        } else {
            System.out.println("7 --> No");
        }

        String f = "ejemplo.pdf";
        System.out.println("8 ->> "+f.endsWith(".pdf"));

        s = "1 2 3";
        int n = s.length();
        System.out.println("9 --> "+n);

        s = "casa";
        r = s.replace('a', 'e');
        System.out.println("10 ->> "+r);
    }
}
