public class EjemploMatches {
    public static void main(String[] args) {
        String pass1 = "Java2026";
        String pass2 = "contr_4se";
        String pass3 = "Admin_123";

        System.out.println("Validando contraseñas (Patron: 8 caracteres alfanumericos");
        System.out.println(pass1 + ": " + esValida(pass1));
        System.out.println(pass2 + ": " + esValida(pass2));
        System.out.println(pass3 + ": " + esValida(pass3));

    }

    /**
     * Utiliza matches apra validar que la cadena cumpla un patron especifico
    */
    public static boolean esValida(String password) {
        // El patron dice: "De rincipio a fin, busca solo letras y numeros, y que sean exactamente8"
        // []
        String patron = "[a-zA-Z0-9_]{9}";

        return password.matches(patron);
    }
    
}
