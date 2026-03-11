public class Prueba1 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        // Crear objeto
        Persona1 p1 = new Persona1("Juan", (byte)25, 1.75, "12345678A");

        // Mostrar datos
        p1.mostrarDatos();
        System.out.println();
        p1.crecer(0.3);
        p1.cumplirAños();
        p1.mostrarDatos();
        p1.saludar();
        System.out.println();
        System.out.println("--------------------------------------------------------------");
    }
}