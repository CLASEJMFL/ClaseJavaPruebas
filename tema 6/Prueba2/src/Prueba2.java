public class Prueba2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        // Crear objeto
        Persona2 p1 = new Persona2(01,"Jose", "Prueba biografia",1500 );
        Persona2 p2 = new Persona2(02,"Pedro", "Prueba biografia",55 );

        //p1.id = 30; //The final field Persona.id cannot be assigned

        // Mostrar datos
        p1.mostrarDatos();
        System.out.println();
        p2.mostrarDatos();
        System.out.println();
        System.out.println("--------------------------------------------------------------");
    }
}
