class Persona1 {
    String nombre;
    byte edad;
    double estatura;

    // Constructor
    public Persona1(String nombre, byte edad, double estatura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre:   " + nombre);
        System.out.println("Edad:     " + edad);
        System.out.println("Estatura: " + estatura);
    }
    void saludar() {
        System.out.println("Hola mi nombre es "+nombre);
        System.out.println("Encantado de conocerte");
    }

    void cumplirAños() {
        edad++; // incrementa la edad en 1
    }

    void crecer(double incremento) {
        estatura += incremento;
    }
}