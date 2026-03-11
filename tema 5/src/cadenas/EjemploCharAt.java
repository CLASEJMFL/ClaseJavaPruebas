public class EjemploCharAt {
    public static void main(String[] args) {
        String texto = "holacomoestas@probando.com";
        int primera = texto.indexOf('@')+1;
        int segunda = texto.indexOf('.',primera);
        String como = texto.substring(primera,segunda);
        System.out.println(como);
    }
}
